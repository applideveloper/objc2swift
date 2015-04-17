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
    sb.append(ctx.IDENTIFIER() + ": ")

    // Parameter type.
    sb.append(Option(ctx.method_type()) match {
      case None => "AnyObject" // Type is not specified.
      case Some(contexts) =>
        // TODO: Convert to Swift's Type
        contexts.get(0).type_name().getText match {
          case "int" => "Int"
          case _     => "AnyObject"
        }
    })
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
    sb.append("}\n\n")

    return sb.toString()
  }

  override def visitCategory_interface(ctx: Category_interfaceContext): String = {
    val sb = new StringBuilder()
    sb.append("extension " + ctx.class_name.getText())

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

    type_name_ctx.getText match {
      case "void" => // No return type
      case _      =>
        Option(type_name_ctx.specifier_qualifier_list().type_specifier()) match {
          case None =>
          case Some(contexts) =>
            val type_specifier_ctxs: collection.mutable.Buffer[ObjCParser.Type_specifierContext] = contexts

            type_specifier_ctxs.foldLeft("")((s, c) => {
              c.getText match {
                case "unsigned" => "unsigned"
                case "int" if s == "unsigned" => "UInt"
                case "int" => "Int"
                case _ => s
              }
            }) match {
              case s if s != "" => sb.append(" -> " + s)
              case _ =>
            }
        }
    }

    sb.append(" {\n")

    //
    // TODO: Implement method's body
    //

    sb.append("    }")

    sb.toString()

  }

}
