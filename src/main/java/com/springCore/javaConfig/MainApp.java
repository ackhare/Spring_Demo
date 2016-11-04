package com.springCore.javaConfig;

import com.springCore.knights.Knight.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.knights.Knight.Knight;
import org.springframework.context.support.
        ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "META-INF/spring/minstrel.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
