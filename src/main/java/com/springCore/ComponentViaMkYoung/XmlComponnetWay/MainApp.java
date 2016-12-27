package com.springCore.ComponentViaMkYoung.XmlComponnetWay;

import com.springCore.ComponentViaMkYoung.XmlComponnetWay.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 26/12/16.
 */


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("//home/chetan/Downloads/Spring-Core-master/src/main/java/com/springCore/ComponentViaMkYoung/XmlComponnetWay/Bean.xml");


        CustomerService cust = (CustomerService) context.getBean("customerService");
        System.out.println(cust);

    }
}

/*
intent of this app is to show thae use of dependency injection via xml and then same app is upgraded to less xml way
Here customerDao is injected into customerService


output
CustomerService [customerDAO=Hello , This is CustomerDAO]
 */