package com.springCore.EventsInSpring;

/**
 * Created by chetan on 19/12/16.
 */

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler
        implements ApplicationListener<ContextStartedEvent>{
//This will fire as soon as contextr.start() is fired of ConfigurableApplicationContext in mainapp
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Received");
    }
}
