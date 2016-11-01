package com.springCore.autoWiring.CompactDisc;
import com.springCore.autoWiring.CompactDisc.CompactDisc;
import org.springframework.stereotype.Component;

@Component  //not done on interface but class
public class SgtPeppers implements CompactDisc {

  private String title = "Billie Jean!";
  private String artist = "Michael Jackson";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
  
}
