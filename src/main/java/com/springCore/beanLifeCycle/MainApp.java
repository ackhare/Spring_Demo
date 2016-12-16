package com.springCore.beanLifeCycle;

/**
 * Created by chetan on 16/12/16.
 */
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {

      AbstractApplicationContext context =     new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/beanLifeCycle/Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
       //Here you need to register a shutdown hook registerShutdownHook()]
       // method that is declared on the AbstractApplicationContext class.
       // This will ensures a graceful shutdown and calls the relevant destroy methods.
      context.registerShutdownHook();
   }
}
/*
Bean is going through init.
Your Message : Hello World!
Bean will destroy now.

Process finished with exit code 0
 */