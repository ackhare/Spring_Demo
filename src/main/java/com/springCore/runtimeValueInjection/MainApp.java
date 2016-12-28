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

/*
The intent of this app is to change valuie of a bean via properties file
you do not even have to touch the code or xml , just change the appp.properties file which should be provided
in xml config

The xml configuration would be



  <context:property-placeholder
    location="META-INF/runtimeValueInjection/app.properties" />

  <bean class="com.springCore.runtimeValueInjection.BlankDisc"
    c:_0 = "${disc.title}"
    c:_1 = "${disc.artist}"/>


 */