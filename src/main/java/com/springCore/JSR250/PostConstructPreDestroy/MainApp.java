package com.springCore.JSR250.PostConstructPreDestroy;

import com.springCore.DIByConstructorsAutowire.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 30/10/16.
 */
public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context =
             new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/JSR250/PostConstructPreDestroy/Beans.xml");


      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      //Todo method is availble with AbstractApplicationContext and not with ApplicationContext
     // This will ensures a graceful shutdown and calls the relevant destroy methods.
      context.registerShutdownHook();
   }
}
/*
Bean is going through init.
Your Message : Hello World!
Bean will destroy now.

 */