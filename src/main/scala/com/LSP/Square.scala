package com.LSP

class Square extends Rectangle {
  override def setBreadth(breadth: Int): Unit = {
    super.setBreadth(breadth)
    super.setLength(breadth)
  }

  override def setLength(length: Int): Unit = {
    super.setLength(length)
    super.setBreadth(length)
  }
}