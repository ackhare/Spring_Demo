package com.springCore.mixedConfig;

import com.springCore.mixedConfig.CompactDisc.CompactDisc;
import com.springCore.mixedConfig.MediaPlayer.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {


    /*
   This will get auto imported

      @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
     */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
