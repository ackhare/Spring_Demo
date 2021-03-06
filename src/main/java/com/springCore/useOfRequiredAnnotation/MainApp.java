package com.springCore.useOfRequiredAnnotation;

/**
 * Created by chetan on 19/12/16.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*
The @Required annotation applies to bean property setter methods and it indicates that the affected bean
property must
be populated in XML configuration file at configuration time otherwise the container throws a
BeanInitializationException exception. Below is an example to show the use of @Required annotation.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/useOfRequiredAnnotation/Beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }
}
/*

The intent of this is to show that if we remove Required annotation
from the setters and then remove it from xml it will work n

suppose you remove age setter @required and then remove the below line from xml it will work

  <property name="age"  value="11" />


  The best part ios that it will give compile time error

 */