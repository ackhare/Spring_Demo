package com.springCore.autoWiring.CDPlayer;
import com.springCore.autoWiring.CompactDisc.CompactDisc;
import com.springCore.autoWiring.CompactDisc.SgtPeppers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Autowiring by properties
@Component  //not done on interface but class
//Annotate with @Component to indicate this is class is an auto scan component.
public class CDPlayer implements MediaPlayer {
  @Autowired
/*
You can use @Autowired annotation on properties to get rid of the setter methods.
 When you will pass values of autowired
properties using <property> Spring will automatically assign those properties with the passed values or
references
.
 */
  private SgtPeppers  cd;
//TODO
//It actually worked with the interface CompactDisc but I relly think the spring may relly get confoused
  //if two classes are present

//In main where a CDplayer ia reuired there we  provide  instance of
  public void play() {
    cd.play();
  }

}
