package com.springCore.DIfromTutorialPoint.AutoWiringByAnnotationOnConstructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/*
You can apply @Autowired to constructors as well. A constructor @Autowired annotation
indicates that the constructor should be autowired when creating the bean,
 even if no <constructor-arg> elements are used while configuring the bean in
 XML file. Let us check the following example.
 */

/**
 * Created by chetan on 30/10/16.
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/IdeaProjects/Spring_Demo/src/main/java/com/springCore/DIfromTutorialPoint/AutoWiringByAnnotationOnConstructor/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
      te.spellCheck();
   }
}
/*
Inside TextEditor constructor.
Inside SpellChecker constructor.
Inside checkSpelling.
 */