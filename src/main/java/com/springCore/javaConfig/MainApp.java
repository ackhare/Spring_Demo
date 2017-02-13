package com.springCore.javaConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.springCore.knights.Knight.Knight;
import org.springframework.context.support.
        ClassPathXmlApplicationContext;

public class MainApp {
    private final Logger logger = LoggerFactory.getLogger(MainApp.class);
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();
    }

}

