package com.springCore.ComponentViaMkYoung.autoscanningWithComponent;

import com.springCore.ComponentViaMkYoung.autoscanningWithComponent.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by chetan on 26/12/16.
 */


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);



        CustomerService cust = (CustomerService) context.getBean("customerService");
        System.out.println(cust);

    }
}
/*
intent of this app is to show thae use of dependency injection via no xml through the use of @COmponet , @componentScdan
and @Configuration
Here customerDao is injected into customerService


output
CustomerService [customerDAO=Hello , This is CustomerDAO]
 */