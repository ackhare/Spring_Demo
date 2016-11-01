package com.springCore.autoWiring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //scan starts from here
/*
Normally you declare all the beans or components in XML bean configuration file, so that Spring container
can detect and
register your beans or components. Actually, Spring is able to auto scan, detect and instantiate your beans from
pre-defined project package, no more tedious beans declaration in in XML file.
 */
public class CDPlayerConfig {

}
