/**
 * This file is part of objc2swift. 
 * https://github.com/yahoojapan/objc2swift
 * 
 * Copyright (c) 2015 Yahoo Japan Corporation
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

import java.io.{SequenceInputStream, FileInputStream}
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.tree.ParseTreeWalker
import collection.JavaConversions._

object Main {
  def main(args: Array[String]) {
    if(args.length == 0) {
      println("error: no input file specified.")
      return
    }

    val options = Map("tree" -> args.contains("-t"))

    val files = args.filter(!_.startsWith("-"))
    val fileStreams = files.map(new FileInputStream(_))
    val stream = new SequenceInputStream(fileStreams.toIterator)
    val input = new ANTLRInputStream(stream)

    val lexer = new ObjCLexer(input)
    val tokens = new CommonTokenStream(lexer)
    val parser = new ObjCParser(tokens)

    val root = parser.translation_unit()
    val converter = new ObjC2SwiftConverter()
    val result = converter.visit(root)

    output(result, files, options, parser, root)
  }

  def output(result: String, files: Array[String], options: Map[String, Boolean], parser: Parser, root: ParserRuleContext) {
    println("/* Hello Swift, Goodbye Obj-C.")
    println(" * converted by 'objc2swift' https://github.com/yahoojapan/objc2swift")
    println(" *")
    println(" * source: " + files.mkString(", "))

    if(options("tree") == true) {
      println(" * source-tree:")
      (new ParseTreeWalker()).walk(new ObjCBaseListener() {
        override def enterEveryRule(ctx: ParserRuleContext): Unit = {
          print(" *" + "  " * ctx.depth)
          print(parser.getRuleNames()(ctx.getRuleIndex) + ": ")
          print("'" + ctx.getStart.getText.replace("\n\r\t", " ") + "'")
          if(ctx.getStart != ctx.getStop){
            print(" - " + "'" + ctx.getStop.getText.replace("\n\r\t", " ") + "'")
          }
          println()
          // 		return "[@"+getTokenIndex()+","+start+":"+stop+"='"+txt+"',<"+type+">"+channelStr+","+line+":"+getCharPositionInLine()+"]";

        }
      }, root)
    }

    println(" */")
    println()

    println(result)
  }
}
