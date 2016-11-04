package com.springCore.xmlConfig.Main;

import com.springCore.autoWiring.CDPlayerConfig;
import com.springCore.xmlConfig.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 4/11/16.
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "META-INF/xmlConfig/CNamespaceValueTest-context.xml");
        CDPlayer cdPlayer=context.getBean(CDPlayer.class);
        cdPlayer.play();
/*
as in xml config
bean id compactDisc will ghive value for blank disc which in turn is needed in  constructor injection of
CDplayer where it will be placed


@Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  So CompactDisc will be given value of BlankDisc


 */
        context.close();
    }
}
