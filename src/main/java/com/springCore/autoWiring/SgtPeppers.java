package com.springCore.autoWiring;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

  private String title = "Billie Jean!";
  private String artist = "Michael Jackson";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
