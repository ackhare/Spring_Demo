package com.springCore.javaConfigs.javaBasedConfiguration;

/**
 * Created by chetan on 19/12/16.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
//ou should note that there is no configuration file required.
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }
}
//

//Hell o world is not directly instantiated but via Hello
//        WorldConfig where a beanb is defined of its name
/*

TODO very important
  @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    Here a @Bean and @Configurationj does complet job and this is very important examplke
 */
