package com.LSP

object LspMain extends {
  def calculateArea(rectangle: Rectangle) = {
    rectangle.setBreadth(6)
    rectangle.setLength(6)
    (rectangle.getArea)
  }

  def main(args: Array[String]): Unit = {
    println(calculateArea(new Rectangle))
    //    An instance of Rectangle is passed

    //    An instance of Sqaure is passed
    println(calculateArea(new Square))
  }

}