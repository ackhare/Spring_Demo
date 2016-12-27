package com.springCore.DIfromTutorialPoint.AutoWiringByType;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 30/10/16.
 */
/*
For example, if a bean definition is set to autowire byType in configuration file, and it contains a spellChecker
property of SpellChecker type, Spring looks for a bean definition named SpellChecker, and uses it to set the property.
 */

/*
So orignally we needed to refrence spellchecked explicitly but now we need to do autowire by type and it will search
a property of spellchecker in texteditor with type SpellChecker which ofcourse is the class SpellChecker
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/DIfromTutorialPoint/AutoWiringByType/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
//here it will go to xml and check for spellcheck instance
      te.spellCheck();
   }
}


/*

/*
The intent is autowire via type through xml than using annotation
Here autowire is included in TextEditor bean because it is
where injection has to take place   and has a setter where argument has to be put
t

   <!-- Definition for textEditor bean -->
   <bean id="textEditor" class="com.springCore.DIfromTutorialPoint.AutoWiringByType.TextEditor"
      autowire="byType">
      <!--<property name="spellChecker" ref="SpellChecker" />-->
      <!--<property name="name" value="Generic Text Editor" />-->
   </bean>

Inside SpellChecker constructor.
Inside checkSpelling.
 */

/*
Inside SpellChecker constructor.
Inside checkSpelling.
 */