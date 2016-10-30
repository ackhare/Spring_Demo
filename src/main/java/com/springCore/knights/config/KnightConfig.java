package com.springCore.knights.config;

import com.springCore.knights.BraveKnight;
import com.springCore.knights.Knight;
import com.springCore.knights.Quest;
import com.springCore.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
