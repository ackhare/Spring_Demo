package com.springCore.autoWiring;

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
