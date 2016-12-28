package com.springCore.mixedConfig;
import com.springCore.mixedConfig.MediaPlayer.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chetan on 4/11/16.
 */
public class MainApp2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoundSystemConfig.class);
        /*
        SoundSystemConfig calls CDPlayerConfig so again it requires a constructor argument
        Now if we comment the @ImportResource then it will output

Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles

Now as we are not commenting it and argument has to be of type CompactDisc which is a constructor argumernt
In the xml  cd-config.xml we have

//<bean id="compactDisc"
//        class="com.springCore.mixedConfig.CompactDisc.BlankDisc"
//        c:_0="Sgt. Pepper's Lonely Hearts Club Band"
//        c:_1="The Beatles">

So we can see that BlankDisc is to be injected (passed) into constructor
Now blankdisc needs 3 argument

  public BlankDisc(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }


  these are passed via xml arguments

         */

       CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();
    }
}
/*
The intent of this app is that to use a xml file as a helper resource and declare it as a part of a java config file
@ImportResource("classpath:META-INF/mixedConfig/cd-config.xml")

The file in itself contains a list which is injected into a list to BlankDisc which
has a constructor for that purpsoie

All the below arguments are injected
  public BlankDisc(String title, String artist, List<String> tracks)

 */

