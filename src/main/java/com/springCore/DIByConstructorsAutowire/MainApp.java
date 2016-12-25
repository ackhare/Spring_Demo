package com.springCore.DIByConstructorsAutowire;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import  com.springCore.Utility.utility;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by chetan on 30/10/16.
 */
public class MainApp {
//   String log4jConfPath = "/path/to/log4j.properties";


   static Logger log = Logger.getLogger(MainApp.class.getName());
   public static void main(String[] args) {
      utility.loadLogger();
      ApplicationContext context =
             new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/DIByConstructorsAutowire/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}
