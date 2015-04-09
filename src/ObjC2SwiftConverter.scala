/**
 * Created by takesano on 15/03/23.
 */

class ObjC2SwiftConverter extends ObjCBaseListener {
  override def enterClass_interface(ctx: ObjCParser.Class_interfaceContext): Unit = {
    println("class: " + ctx.getText())
  }
}
