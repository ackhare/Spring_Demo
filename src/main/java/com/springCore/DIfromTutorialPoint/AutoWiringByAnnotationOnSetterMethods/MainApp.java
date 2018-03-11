package com.springCore.DIfromTutorialPoint.AutoWiringByAnnotationOnSetterMethods;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/*
 When Spring finds an @Autowired annotation used with setter methods, it tries to
 perform
 byType autowiring on the method.

 Here Autowired annotation will be onsetter method
 */
/**
 * Created by chetan on 30/10/16.
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/IdeaProjects/Spring_Demo/src/main/java/com/springCore/DIfromTutorialPoint/AutoWiringByAnnotationOnSetterMethods/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}
