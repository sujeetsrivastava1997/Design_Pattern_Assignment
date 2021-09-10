package com.LSP

import org.scalatest._
import flatspec._

class LSPMainSpec extends AnyFlatSpec {

  val obj :Rectangle = new Rectangle
  val lengths = 10
  val bredth = 5
  "LSP call" should "to be passed" in {
    val lsp = LspMain
    assert(lsp.calculateArea(new Rectangle) == 36)
    assert(lsp.calculateArea(new Square) == 36)
  }

}