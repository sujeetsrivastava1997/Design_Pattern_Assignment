package com.LSP

class Rectangle {
  private var length = 0
  private var breadth = 0

  def getLength: Int = length

  def setLength(length: Int): Unit = {
    this.length = length
  }

  def getBreadth: Int = breadth

  def setBreadth(breadth: Int): Unit = {
    this.breadth = breadth
  }

  def getArea: Int = this.length * this.breadth
}