package com.springCore.EventsInSpring;

/**
 * Created by chetan on 19/12/16.
 */
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler
        implements ApplicationListener<ContextStoppedEvent>{
    //This will fire as soon as context.stop() is fired of ConfigurableApplicationContext in mainapp
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received");
    }
}
