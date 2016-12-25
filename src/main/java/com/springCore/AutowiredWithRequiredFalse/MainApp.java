package com.springCore.AutowiredWithRequiredFalse;

/**
 * Created by chetan on 19/12/16.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =    new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/AutowiredWithRequiredFalse/Beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }
}
