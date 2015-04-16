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

class ObjC2SwiftConverter extends ObjCBaseVisitor[String] {
  val properties = new ParseTreeProperty[String]()

  def concatChildResults(node: ParseTree, glue: String): String = {
    val children = for(i <- 0 until node.getChildCount) yield node.getChild(i)
    return concatResults(children.toList, glue)
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
    return sb.toString
  }

  def convertParameter(sb: StringBuilder, ctx: ObjCParser.Keyword_declaratorContext): StringBuilder = {

    // Parameter name.
    sb.append(ctx.IDENTIFIER())

    // Parameter type.
    if (ctx.method_type() == null) {

      // Type is not specified.
      sb.append(": AnyObject")

    } else {

      val param_type: ObjCParser.Method_typeContext = ctx.method_type(0)
      val objCType: String = param_type.type_name().getText

      // TODO: Convert to Swift's Type
      sb.append(": " + objCType)

    }

  }

  override def visitTranslation_unit(ctx: ObjCParser.Translation_unitContext): String = {
    return concatChildResults(ctx, "\n")
  }

  override def visitExternal_declaration(ctx: ObjCParser.External_declarationContext): String = {
    return concatChildResults(ctx, "\n")
  }

  override def visitClass_interface(ctx: ObjCParser.Class_interfaceContext): String = {
    val sb = new StringBuilder()
    sb.append("class " + ctx.class_name.getText())

    if(ctx.superclass_name() != null) {
      sb.append(" : ")
      sb.append(ctx.superclass_name().getText())
    }
    if(ctx.protocol_reference_list() != null) {
      val protocols = ctx.protocol_reference_list().protocol_list().children.filter(_.isInstanceOf[ObjCParser.Protocol_nameContext])
      sb.append(protocols.foldLeft("")(_ + ", " + _.getText))
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

    return sb.toString()
  }

  override def visitInterface_declaration_list(ctx: ObjCParser.Interface_declaration_listContext): String = {
    concatChildResults(ctx, "\n")
  }

  override def visitInstance_method_declaration(ctx: ObjCParser.Instance_method_declarationContext): String = {

    val sb = new StringBuilder()

    sb.append("    func ")

    val method_declaration_ctx: ObjCParser.Method_declarationContext = ctx.method_declaration()

    //
    // Method name.
    //
    val method_selector_ctx: ObjCParser.Method_selectorContext = method_declaration_ctx.method_selector()

    if (method_selector_ctx.selector() != null) {

      // No parameter.
      sb.append(method_selector_ctx.selector().getText + "()")

    } else {

      val keyword_declarator_ctx_first: ObjCParser.Keyword_declaratorContext = method_selector_ctx.keyword_declarator(0)
      if (keyword_declarator_ctx_first.selector() == null) {
        // Syntax error: No method name.
      } else {
        sb.append(keyword_declarator_ctx_first.selector().getText)
      }

      sb.append("(")

      //
      // Parameters.
      //
      method_selector_ctx.keyword_declarator().zipWithIndex.foreach {
        case (ctx: ObjCParser.Keyword_declaratorContext, i) if i == 0 => convertParameter(sb, ctx)
        case (ctx: ObjCParser.Keyword_declaratorContext, i) if i != 0 => convertParameter(sb.append(", "), ctx)
      }

      sb.append(")")

    }

    //
    // Method type.
    //
    val type_name: ObjCParser.Type_nameContext = method_declaration_ctx.method_type().type_name()
    if (type_name.getText != "void") {
      // TODO: Add retval type.
    }

    sb.append(" {\n")
    sb.append("    }")

    sb.toString()

  }

}
