package com.ISP

class DivMediaPlayer extends VideoPlayer with AudioPlayer {
  def playVideo(): Unit = {
    println(" Playing video on Div Media Player..........")
  }

  def playAudio(): Unit = {
    println(" Playing audio on Div Media Player..........")
  }
}