package com.springCore.DIfromTutorialPoint.AutoWiringByAnnotationOnProperties;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/*
You can use @Autowired annotation on properties to get rid of the setter methods.
 When you pass the values of autowired properties  Spring will automatically assign
  those properties with the passed values or references.
 */

/**
 * Created by chetan on 30/10/16.
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/IdeaProjects/Spring_Demo/src/main/java/com/springCore/DIfromTutorialPoint/AutoWiringByAnnotationOnProperties/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}
/*
Inside TextEditor constructor.
Inside SpellChecker constructor.
Inside checkSpelling.
 */