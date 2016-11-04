package com.springCore.xmlConfig.Main;

import com.springCore.xmlConfig.CDPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 4/11/16.
 */
public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "META-INF/xmlConfig/ConstructorArgCollectionTest-context.xml");
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
    }
}