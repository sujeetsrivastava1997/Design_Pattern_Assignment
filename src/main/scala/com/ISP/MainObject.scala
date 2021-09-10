package com.ISP

object MainObject extends App {

  val vlc = new VlcMediaPlayer
  val div = new DivMediaPlayer
  val win = new WinAmpPlayer
  vlc.playAudio()
  vlc.playVideo()
  win.playAudio()
  div.playAudio()
  div.playVideo()

}