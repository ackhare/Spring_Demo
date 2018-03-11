package com.springCore.DIfromTutorialPoint.DIByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 30/10/16.
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/IdeaProjects/Spring_Demo/src/main/java/com/springCore/DIfromTutorialPoint/DIByConstructor/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
//here it will go to xml and check for spellcheck instance
      te.spellCheck();
   }
}
/*
Inside SpellChecker constructor.
Inside TextEditor constructor.
Inside checkSpelling.
 */