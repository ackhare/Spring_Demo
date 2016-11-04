package com.springCore.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicConfig {
/*
 To declare a bean, simply annotate a method with the @Bean annotation. When JavaConfig encounters such a method,
 it will execute that method and register the return value as a bean within a BeanFactory.
 By default, the bean name will be the same as the method name
 */
  @Bean
  @Conditional(MagicExistsCondition.class)
  public MagicBean magicBean() {
    return new MagicBean();
  }
  
}