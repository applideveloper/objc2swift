/**
 * This file is part of objc2swift. 
 * https://github.com/yahoojapan/objc2swift
 * 
 * Copyright (c) 2015 Yahoo Japan Corporation
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

import ObjCParser._
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.{ParseTree, ParseTreeProperty}
import collection.JavaConversions._

class ObjC2SwiftConverter(_root: ObjCParser.Translation_unitContext) extends ObjCBaseVisitor[String] {
  val root = _root
  val visited = new ParseTreeProperty[Boolean]()

  def getResult: String = {
    visit(root)
  }

  def concatChildResults(node: ParseTree, glue: String): String = {
    val children = for(i <- 0 until node.getChildCount) yield node.getChild(i)
    concatResults(children.toList, glue)
  }

  def concatResults(nodes: List[ParseTree], glue: String): String = {
    val sb = new StringBuilder()
    for(node <- nodes) {
      if(sb.length > 0)
        sb.append(glue)

      val r = visit(node)
      if(r != null)
        sb.append(r)
    }
    sb.toString
  }

  def indentLevel(node: ParserRuleContext): Int = {
    node.depth() match {
      case n if (n < 4) => 0 // class
      case n if (n < 8) => 1 // method
      case _ => 2
    }
  }

  def indent(node: ParserRuleContext): String = {
    "    " * indentLevel(node)
  }

  //
  // TODO: Convert to Swift's Type
  //
  // Supported type:
  //   id           => AnyObject
  //   (signed) int => Int
  //   unsigned int => UInt
  //
  def convertTypeName(ctx: ObjCParser.Type_nameContext): String = {
    val defaultType = "AnyObject"
    Option(ctx.specifier_qualifier_list().type_specifier()) match {
      case None => defaultType
      case Some(contexts) =>
        val type_specifier_ctxs: collection.mutable.Buffer[ObjCParser.Type_specifierContext] = contexts
        type_specifier_ctxs.foldLeft(defaultType)((type_str, context) => {
          context.getText match {
            case "id" => defaultType
            case "void" => ""
            case "unsigned" => "unsigned"
            case "int" if type_str == "unsigned" => "UInt"
            case "int" => "Int"
            case _ => type_str
          }
        })
    }
  }

  def convertParameter(sb: StringBuilder, ctx: ObjCParser.Keyword_declaratorContext): StringBuilder = {
    // Parameter name.
    sb.append(ctx.IDENTIFIER() + ": ")

    // Parameter type.
    sb.append(Option(ctx.method_type()) match {
      case None => "AnyObject" // Type is not specified.
      case Some(contexts) =>
        // TODO: Convert to Swift's Type
        convertTypeName(contexts.get(0).type_name) match {
          case s if s != "" => s
          case _ => "" // Syntax error?
        }
    })
  }

  def findCorrespondingClassImplementation(classCtx: ObjCParser.Class_interfaceContext): Class_implementationContext = {
    val list = root.external_declaration
    for (extDclCtx <- list) {
      for (ctx <- extDclCtx.children if ctx.isInstanceOf[ObjCParser.Class_implementationContext]) {
        val implCtx = ctx.asInstanceOf[ObjCParser.Class_implementationContext]
        if(implCtx.class_name.getText == classCtx.class_name.getText)
          return implCtx
      }
    }

    null
  }

  def findCorrespondingMethodDefinition(declCtx: ObjCParser.Instance_method_declarationContext): ObjCParser.Instance_method_definitionContext = {
    val classCtx = declCtx.parent.parent.asInstanceOf[ObjCParser.Class_interfaceContext]
    val implCtx = findCorrespondingClassImplementation(classCtx)
    if(implCtx == null)
      return null

    for(ctx <- implCtx.implementation_definition_list.children if ctx.isInstanceOf[ObjCParser.Instance_method_definitionContext]) {
      val defCtx = ctx.asInstanceOf[ObjCParser.Instance_method_definitionContext]
      if(defCtx.method_definition.method_selector.getText == declCtx.method_declaration.method_selector.getText) {
        return defCtx
      }
    }

    null
  }

  override def visitTranslation_unit(ctx: ObjCParser.Translation_unitContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitExternal_declaration(ctx: ObjCParser.External_declarationContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitClass_interface(ctx: ObjCParser.Class_interfaceContext): String = {
    val sb = new StringBuilder()
    sb.append("class " + ctx.class_name.getText)

    if(ctx.superclass_name() != null) {
      sb.append(" : ")
      sb.append(ctx.superclass_name().getText)
    }
    if(ctx.protocol_reference_list() != null) {
      val protocols = ctx.protocol_reference_list()
        .protocol_list()
        .children
        .filter(_.isInstanceOf[ObjCParser.Protocol_nameContext])
        .map(_.getText)
      sb.append(", " + protocols.mkString(", "))
    }

    sb.append(" {\n")
    if(ctx.interface_declaration_list() != null) {
      val result = visit(ctx.interface_declaration_list())
      if(result != null) {
        sb.append(result)
        sb.append("\n")
      }
    }

    val implCtx = findCorrespondingClassImplementation(ctx)
    if(implCtx != null) {
      val result = visit(implCtx.implementation_definition_list)
      if(result != null) {
        sb.append(result)
        sb.append("\n")
      }
    }

    sb.append("}\n\n")

    sb.toString()
  }

  override def visitCategory_interface(ctx: Category_interfaceContext): String = {
    val sb = new StringBuilder()
    sb.append("extension " + ctx.class_name.getText)

    if(ctx.protocol_reference_list() != null) {
      val protocols = ctx.protocol_reference_list()
        .protocol_list()
        .children
        .filter(_.isInstanceOf[ObjCParser.Protocol_nameContext])
        .map(_.getText)
      sb.append(" : " + protocols.mkString(", "))
    }

    sb.append(" {\n")
    if(ctx.interface_declaration_list() != null) {
      val result = visit(ctx.interface_declaration_list())
      if(result != null) {
        sb.append(result)
        sb.append("\n")
      }
    }
    sb.append("}")

    sb.toString()
  }

  override def visitInterface_declaration_list(ctx: ObjCParser.Interface_declaration_listContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitInstance_method_declaration(ctx: ObjCParser.Instance_method_declarationContext): String = {

    val sb = new StringBuilder()

    sb.append(indent(ctx) + "func ")

    val method_declaration_ctx: ObjCParser.Method_declarationContext = ctx.method_declaration()

    //
    // Method name.
    //
    val method_selector_ctx: ObjCParser.Method_selectorContext = method_declaration_ctx.method_selector()

    Option(method_selector_ctx.selector()) match {
      case Some(c) => sb.append(c.getText + "()") // No parameter.
      case None    =>
        Option(method_selector_ctx.keyword_declarator(0).selector()) match {
          case None => // Syntax error? No method name.
          case Some(c) =>
            // Has parameters.
            sb.append(c.getText + "(")
            method_selector_ctx.keyword_declarator().zipWithIndex.foreach {
              case (c: ObjCParser.Keyword_declaratorContext, 0) => convertParameter(sb, c)
              case (c: ObjCParser.Keyword_declaratorContext, i) => convertParameter(sb.append(", "), c)
            }
            sb.append(")")
        }
    }

    //
    // Method type.
    //
    // TODO: Convert to Swift's Type
    //
    // Supported type:
    //   (signed) int => Int
    //   unsigned int => UInt
    //
    val type_name_ctx: ObjCParser.Type_nameContext = method_declaration_ctx.method_type().type_name()

    convertTypeName(type_name_ctx) match {
      case s if s != "" => sb.append(" -> " + s)
      case _ => // No return type
    }

    sb.append(" {\n")

    val impl = findCorrespondingMethodDefinition(ctx)
    if(impl != null) {
      visited.put(impl, true)
      sb.append(visit(impl.method_definition.compound_statement))
    }
    sb.append(indent(ctx) + "}")

    sb.toString()
  }


  override def visitClass_implementation(ctx: Class_implementationContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitImplementation_definition_list(ctx: Implementation_definition_listContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitInstance_method_definition(ctx: ObjCParser.Instance_method_definitionContext): String = {
    if(visited.get(ctx))
      return null

    // TODO Print Method Definition

    visit(ctx.method_definition.compound_statement)
  }

  override def visitCompound_statement(ctx: Compound_statementContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitStatement_list(ctx: Statement_listContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitStatement(ctx: StatementContext): String = {
    indent(ctx) + "// statement" // TODO
  }
}
