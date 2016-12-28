package com.springCore.mixedConfig.MediaPlayer;
import com.springCore.mixedConfig.CompactDisc.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

  //Compactdisc is being injected
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
