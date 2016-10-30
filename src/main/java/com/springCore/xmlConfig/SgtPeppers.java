package com.springCore.xmlConfig;

public class SgtPeppers implements CompactDisc {

  private String title = "Man in the Mirror!";
  private String artist = "Michael Jackson";
  
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }

}
