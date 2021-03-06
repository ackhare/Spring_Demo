package com.springCore.knights.config;


import com.springCore.knights.Knight.BraveKnight;
import com.springCore.knights.Knight.Knight;
import com.springCore.knights.Quest.Quest;
import com.springCore.knights.Quest.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
@Configuration
public class KnightConfig {

  //The below beans will get active when Knoight and quest

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
