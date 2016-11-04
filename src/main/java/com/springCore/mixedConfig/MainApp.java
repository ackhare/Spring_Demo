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
        CompactDisc player = context.getBean(CompactDisc.class);
        player.play();
        context.close();
    }
}

