package com.springCore.CircularDependency;

import com.springCore.ComponentViaMkYoung.autoscanningWithComponent.Config;
import com.springCore.ComponentViaMkYoung.autoscanningWithComponent.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by chetan on 6/4/18.
 */
public class Main {
    @Bean
    public CircularDependencyA getCircularDependencyA() {
        return new CircularDependencyA();
    }

    @Bean
    public CircularDependencyB getCircularDependencyB() {
        return new CircularDependencyB();
    }
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TestConfig.class);



        CircularDependencyA circA = context.getBean(CircularDependencyA.class);

        System.out.println(circA.getCircB().getMessage());
        //CustomerService cust = (CustomerService) context.getBean("customerService");
        //System.out.println(cust);

    }
}
