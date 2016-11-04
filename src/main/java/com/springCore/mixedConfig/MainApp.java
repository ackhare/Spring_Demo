package com.springCore.mixedConfig;

import com.springCore.mixedConfig.CompactDisc.CompactDisc;
import com.springCore.mixedConfig.MediaPlayer.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chetan on 4/11/16.
 */
public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDConfig.class);
        //will go to CDPlayerConfig which has a code as below
        /*
        @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
         */

        /*
        As it is a @configuration itr is liable for being used in configuration
        Now when an object of CompactDisc class is being created it will actually return sgtPepper as a class
        and will invoke sgtpepper's play method
        This one does not need any xml file for its working as it is not depoendent on any other thing

         */
        CompactDisc player = context.getBean(CompactDisc.class);
        player.play();
        context.close();
    }
}

