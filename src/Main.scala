import java.io.FileInputStream
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.ParseTreeWalker

/**
 * Created by takesano on 15/03/23.
 */
object Main {
  def main(args: Array[String]) {
    println("hello swift, goodbye obj-c.")

    val input = new ANTLRInputStream(new FileInputStream("sample/sample.h"))
    val lexer = new ObjCLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new ObjCParser(tokens)
    val root = parser.translation_unit()

    val walker = new ParseTreeWalker()
    val listener = new MyObjCListener()

    walker.walk(listener, root)
  }
}
