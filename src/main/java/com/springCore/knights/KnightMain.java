package com.springCore.knights;

import com.springCore.knights.Knight.Knight;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext(
            "META-INF/spring/minstrel.xml");
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

}
/*
The intent of this demo is to show AOP along with injection
Also autowire is not being used buit @Bean is used to register interfaces like Knight and Quest
As on line above
 Knight knight = context.getBean(Knight.class);

 when this will execute the @Bean will execute for

 (@Bean
  public Knight knight() {
    return new BraveKnight(quest());
  })


 Now as we see Quest is injected ito BraveKnight which is same as what above returns ( return new BraveKnight(quest());)

Som when quest is used there

public BraveKnight(Quest quest) {
    this.quest = quest;
  }


  So this is how this @configuration file is used more as a helper file top xml file ministerel.xml

  While the xml file simply provide the constructor arguments of abovew files

 */