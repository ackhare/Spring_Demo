package com.springCore.mixedConfig;
import com.springCore.mixedConfig.MediaPlayer.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chetan on 4/11/16.
 */
public class MainApp1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        //will go to CDPlayerConfig which has a code as below
        /*
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    This alsos has a @import which imports CDConfig used in MainApp
         */

        /*
        As it is a @configuration itr is liable for being used in configuration
        Here an object of compact disc is required to run this to pass as a constructor whicomes from import in CDPlayerConfig
         */
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();
    }
}

/*

The intent is to use a diffrent config file which extends the base config file CDConfig
This example makes use of Media player package  and because compact disc is injected into CD Player the base config is usded
to decipher that
The first main and this main making use of same CDconfig but they are injecting bean at diffrent placers for compact disfc


 */