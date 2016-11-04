package com.springCore.runtimeValueInjection;

import com.springCore.knights.Knight.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 4/11/16.
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "META-INF/runtimeValueInjection/placeholder-config.xml");
        BlankDisc blankDisc = context.getBean(BlankDisc.class);
        System.out.println(blankDisc.getArtist());
        System.out.println(blankDisc.getTitle());
        context.close();
    }
}
