package com.springCore.DIBYSetterWithAutowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 30/10/16.
 */
/*
The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor,
a property or methods with arbitrary names and/or multiple arguments.
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context =
             new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/DIBYSetterWithAutowire/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}
