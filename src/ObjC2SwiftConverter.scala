import ObjCParser._
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.{ParseTree, ParseTreeProperty}
import collection.JavaConversions._

/**
 * Created by takesano on 15/03/23.
 */

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

  /*
  override def exitClass_interface(ctx: ObjCParser.Class_interfaceContext): Unit = {
    val sb = new StringBuilder()

    sb.append("class " + ctx.class_name.getText() + " ")
    if(ctx.superclass_name() != null) {
      sb.append(": " + ctx.superclass_name().getText)
    }

    if(ctx.protocol_reference_list() != null) {
      val protocols = ctx.protocol_reference_list.getChild(1)
      sb.append(", ")
      sb.append(concatChildResults(protocols, ", "))
    } else {
      sb.append(" ")
    }

    sb.append("{\n")
    sb.append(concatChildResults(ctx, "\n"))
    sb.append("}")
    setResult(ctx, sb.toString())
  }
*/
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
      sb.append(protocols.map(_.getText).fold("")(_ + ", " + _))
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
}
