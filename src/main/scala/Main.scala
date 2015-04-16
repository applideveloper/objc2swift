/**
 * This file is part of objc2swift. 
 * https://github.com/yahoojapan/objc2swift
 * 
 * Copyright (c) 2015 Yahoo Japan Corporation
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

import java.io.FileInputStream
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.ParseTreeWalker

object Main {
  def main(args: Array[String]) {
    if(args.length == 0) {
      println("error: no input file specified.")
      return
    }

    val file = args(0)
    val input = new ANTLRInputStream(new FileInputStream(file))
    val lexer = new ObjCLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new ObjCParser(tokens)

    val root = parser.translation_unit()
    val converter = new ObjC2SwiftConverter()

    println("// Hello Swift, Goodbye Obj-C.")
    println("// converted from: " + file)
    println()
    println(converter.visit(root))
  }
}
