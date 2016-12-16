package com.springCore.BeanPostProcessor;

/**
 * Created by chetan on 16/12/16.
 */
/*
This is very basic example of implementing BeanPostProcessor, which prints a bean name before and after initialization
of any bean. You can implement more complex logic before and after instantiating a bean because you have access on bean
object inside both the post processor methods.
 */

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;
//As can be seen it implements BeanPostProcessor
public class InitHelloWorld implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }

}