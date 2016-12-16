package com.springCore.BeanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 16/12/16.
 */
/*
The following examples show how to write, register, and use BeanPostProcessors
in the context of an ApplicationContext.
 */
public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/BeanPostProcessor/Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        //Here you need to register a shutdown hook registerShutdownHook()]
        // method that is declared on the AbstractApplicationContext class.
        // This will ensures a graceful shutdown and calls the relevant destroy methods.

        context.registerShutdownHook();
    }
}


/*
log4j:WARN No appenders could be found for logger (org.springframework.core.env.StandardEnvironment).
log4j:WARN Please initialize the log4j system properly.
BeforeInitialization : helloWorld
Bean is going through init.
AfterInitialization : helloWorld
Your Message : Hello World!
Bean will destroy now.

Process finished with exit code 0
 */