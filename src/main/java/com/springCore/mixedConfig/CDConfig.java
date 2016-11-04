package com.springCore.mixedConfig;

import com.springCore.mixedConfig.CompactDisc.CompactDisc;
import com.springCore.mixedConfig.CompactDisc.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
  //here it is creating a bean which could be injected

  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
}