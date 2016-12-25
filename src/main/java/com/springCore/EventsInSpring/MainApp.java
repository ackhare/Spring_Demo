package com.springCore.EventsInSpring;

/**
 * Created by chetan on 19/12/16.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        //First diffrence to be noted is that ConfigurableApplicationContext is used instead of ApplicationContext
        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/EventsInSpring/Beans.xml");

        /*
        ContextStartedEvent--->
This event is published when the ApplicationContext is started using the start() method on the
ConfigurableApplicationContext interface.
         */

        // Let us raise a start event.
        context.start();
        System.out.println("Context start event started");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        // Let us raise a stop event.

        /*
        ContextStoppedEvent------->
This event is published when the ApplicationContext is stopped using the stop() method on the ConfigurableApplicationContext
interface. You can do required housekeep work after receiving this event.
         */
        context.stop();
        System.out.println("Context stop event started");
    }

}
