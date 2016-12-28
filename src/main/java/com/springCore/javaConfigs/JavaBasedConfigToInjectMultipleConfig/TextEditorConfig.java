package com.springCore.javaConfigs.JavaBasedConfigToInjectMultipleConfig;

/**
 * Created by chetan on 19/12/16.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
//When @Beans have dependencies on one another, expressing that dependency is
// as simple as having one bean method calling another as follows:

    /*
     The @Bean annotation tells Spring that a method annotated with @Bean
     will return an object that should be registered as a bean in the Spring application context

      TextEditor te = ctx.getBean(TextEditor.class);
The above ctx.getBean(TextEditor.class);  will be replaced by  return new TextEditor( spellChecker() )]
which again is a constructor inject
TODO easy to do constructor injection through @bean
        te.spellCheck();


     */
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    //This will be inviked when spellchecker is injected into TextEditor
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
