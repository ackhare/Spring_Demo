package com.springCore.DIfromTutorialPoint.InjectingCollection;

/**
 * Created by chetan on 17/12/16.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/DIfromTutorialPoint/InjectingCollection/Beans.xml");

//here id of the bean is passed as defined in xml file
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
/*
Internally the collection is intialkiazed and given values from xml
 */
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
/*
List Elements :[INDIA, Pakistan, USA, USA]
Set Elements :[INDIA, Pakistan, USA]
Map Elements :{1=INDIA, 2=Pakistan, 3=USA, 4=USA}
Property Elements :{two=Pakistan, one=INDIA, three=USA, four=USA}
 */