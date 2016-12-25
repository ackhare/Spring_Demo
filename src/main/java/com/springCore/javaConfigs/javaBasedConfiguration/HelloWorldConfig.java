package com.springCore.javaConfigs.javaBasedConfiguration;

/**
 * Created by chetan on 19/12/16.
 */
import org.springframework.context.annotation.*;
/*
Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC
container as a source of bean definitions.
 */
@Configuration
public class HelloWorldConfig {
/*
The @Bean annotation tells Spring that a method annotated with @Bean will
 'return an object that should be registered as a bean in the Spring application context.
 */
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
