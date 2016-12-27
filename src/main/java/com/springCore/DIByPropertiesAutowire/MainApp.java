package com.springCore.DIByPropertiesAutowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 30/10/16.
 */

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context =
             new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/DIByPropertiesAutowire/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}
/*

The intent is DIByPropertiesAutowire
So when the spellchecker is injected inro texteditor then it is annotated by auto wired and so bean body is not given

 */