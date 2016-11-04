package com.springCore.javaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
  // When JavaConfig encounters such a method,

  //it will execute that method and register the return value as a bean within a BeanFactory.
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }

 // When JavaConfig encounters such a method,

  //it will execute that method and register the return value as a bean within a BeanFactory.
 //TODO what is the purpose of this
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
