package com.springCore.javaConfig;


public class SgtPeppers implements CompactDisc {

    private String title = "Smooth Criminal!";
    private String artist = "Michael Jackson";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
