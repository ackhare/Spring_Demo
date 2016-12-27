package com.springCore.autoWiring;

import com.springCore.autoWiring.CDPlayer.CDPlayer;
import com.springCore.autoWiring.CDPlayerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hitenpratap on 22/10/16.
 */
public class CDPlayerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();
    }
}
/*
Intent of this demo is autrowiring by setter methods
SgtPeppers is injected into CDPlayer class(through autowiring) so that when it can be used
Interface is just used for demo

 */


/*
Playing Billie Jean! by Michael Jackson
 */