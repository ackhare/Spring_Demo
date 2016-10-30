package com.springCore.xmlConfig.properties;
import org.springframework.beans.factory.annotation.Autowired;

import com.springCore.xmlConfig.CompactDisc;
import com.springCore.xmlConfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
