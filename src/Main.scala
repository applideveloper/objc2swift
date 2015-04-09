import java.io.FileInputStream
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.ParseTreeWalker

/**
 * Created by takesano on 15/03/23.
 */
object Main {
  def main(args: Array[String]) {
    if(args.length == 0) {
      println("error: no input file specified.")
      return
    }

    println("// Hello swift, goodbye obj-c.")

    val file = args(0)
    val input = new ANTLRInputStream(new FileInputStream(file))
    val lexer = new ObjCLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new ObjCParser(tokens)

    val root = parser.translation_unit()
    val walker = new ParseTreeWalker()
    val listener = new ObjC2SwiftConverter()

    walker.walk(listener, root)
  }
}
