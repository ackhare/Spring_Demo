package com.springCore.Aop.JavaBased;

/**
 * Created by chetan on 25/12/16.
 */
/*
This is java based annotation based AOP
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/Aop/JavaBased/Beans.xml");


        Student student = (Student) context.getBean("student");

        student.getName();
        student.getAge();

        student.printThrowException();
    }
}

/*
Going to setup student profile.
Name : Zara
Student profile has been setup.
Returning:Zara
Age : 11
Exception raised
Exception in thread "main" java.lang.IllegalArgumentException
	at com.springCore.Aop.JavaBased.Student.printThrowException(Student.java:30)
 */