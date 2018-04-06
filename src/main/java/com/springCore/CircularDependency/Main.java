package com.springCore.CircularDependency;

import com.springCore.ComponentViaMkYoung.autoscanningWithComponent.Config;
import com.springCore.ComponentViaMkYoung.autoscanningWithComponent.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chetan on 6/4/18.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TestConfig.class);



        //CustomerService cust = (CustomerService) context.getBean("customerService");
        //System.out.println(cust);

    }
}
