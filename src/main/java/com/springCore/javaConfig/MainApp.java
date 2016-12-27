package com.springCore.javaConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.knights.Knight.Knight;
import org.springframework.context.support.
        ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();
    }

}

