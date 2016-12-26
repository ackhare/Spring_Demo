package com.springCore.Aop.XmlBased;

/**
 * Created by chetan on 25/12/16.
 */
public class Student {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        System.out.println("Age : " + age);
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    public void printThrowException() {
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}

/*
Going to setup student profile.
Name : Zara
Exception in thread "main" java.lang.IllegalArgumentException
	at com.springCore.Aop.XmlBased.Student.printThrowException(Student.java:30)
	at com.springCore.Aop.XmlBased.Student$$FastClassBySpringCGLIB$$921f43aa.invoke(<generated>)
Student profile has been setup.
Returning:Zara
Age : 11
Exception raised
	at org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:204)
*/