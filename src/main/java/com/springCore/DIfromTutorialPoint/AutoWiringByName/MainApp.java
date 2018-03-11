package com.springCore.DIfromTutorialPoint.AutoWiringByName;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 30/10/16.
 */
/*
For example, if a bean definition is set to autowire byName in configuration file, and it contains a spellChecker
property (that is, it has a setSpellChecker(...) method), Spring looks for a bean definition named spellChecker, and
uses it to set the property. Still you can wire remaining properties using <property> tags. Following example will
illustrate the concept.
 */

/*
So orignally we needed to refrence spellchecked explicitly but now we need to do autowire by name and
 it will search a property of spellchecker in texteditor with a setter method
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/DIfromTutorialPoint/AutoWiringByName/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
//here it will go to xml and check for spellcheck instance
      te.spellCheck();
   }
}
/*
Inside SpellChecker constructor.
Inside checkSpelling.
 */

/*
The intent is autowire via name through xml than using annotation
Here autowire is included in TextEditor bean because it is
where injection has to take place   and hasa setter method
   <bean id="textEditor" class="com.springCore.DIfromTutorialPoint.AutoWiringByName.TextEditor"
      autowire="byName">

   </bean>

Inside SpellChecker constructor.
Inside checkSpelling.
 */