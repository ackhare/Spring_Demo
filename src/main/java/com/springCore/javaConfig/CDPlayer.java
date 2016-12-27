package com.springCore.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
    //TODO very important thing to be noted that an interface is used only here while till now class was being used
    //because in config file  we have done
  /*
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
   */

  //Thisa means that when this interface will be injected it will find @Bean which is actually returning SgtPerppers
    private CompactDisc cd;

    //so SgtPerppers bean will be injected here and it will work same as last examples
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
