package com.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    // When JavaConfig encounters such a method,

    //it will execute that method and register the return value as a bean within a BeanFactory.
    //Now when compact disc is injected into CDPlayer it is actually injecting SgtPeppers in texteditor as in previous examples
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    // When JavaConfig encounters such a method,

    //it will execute that method and register the return value as a bean within a BeanFactory.
    //When in main file we will execute
    /*
            CDPlayer player = context.getBean(CDPlayer.class);
        player.play();


        In CDPlayer we r using constructor injection which is autowired
 so

  @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

so by mirroring this.cd will actually return new CDPlayer(compactDisc);

     */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
