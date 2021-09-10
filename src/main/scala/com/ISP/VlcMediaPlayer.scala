package com.ISP

class VlcMediaPlayer extends VideoPlayer with AudioPlayer {
  def playVideo(): Unit = {
    println(" Playing video on Vlc...")
  }

  def playAudio(): Unit = {
    println(" Playing audio on Vlc...")
  }
}