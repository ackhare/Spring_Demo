package com.springCore.autoWiring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  @Autowired
  private SgtPeppers cd;



  public void play() {
    cd.play();
  }

}
