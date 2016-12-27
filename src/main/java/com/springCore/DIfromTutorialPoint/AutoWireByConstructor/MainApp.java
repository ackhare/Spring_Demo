package com.springCore.DIfromTutorialPoint.AutoWireByConstructor;


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
For example, if a bean definition is set to autowire by constructor in configuration file,
and it has a constructor with
one of the arguments of SpellChecker type,
Spring looks for a bean definition named SpellChecker, and uses it to set the
constructor's argument.
Still you can wire remaining arguments using <constructor-arg> tags. Following example will
illustrate the concept.
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/DIfromTutorialPoint/AutoWireByConstructor/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");
//here it will go to xml and check for spellcheck instance
      te.spellCheck();
   }
}
/*
The intent is autowire via constructor through xml than using annotation
Here autowire is included in TextEditor bean because it is where injection has to take place   and has a constructor where
argument has to be put

 <bean id="textEditor" class="com.springCore.DIfromTutorialPoint.AutoWireByConstructor.TextEditor"
 autowire="constructor">
      <!--<constructor-arg  ref="spellChecker" />-->
      <constructor-arg  value="Generic Text Editor"/>
   </bean>

Inside SpellChecker constructor.
Inside checkSpelling.
 */