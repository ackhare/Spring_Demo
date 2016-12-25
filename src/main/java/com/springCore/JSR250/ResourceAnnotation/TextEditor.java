package com.springCore.JSR250.ResourceAnnotation;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */
import javax.annotation.Resource;
/*
You can use @Resource annotation on fields or setter methods and it works the same as in Java EE 5.
The @Resource annotation takes a 'name' attribute which will be interpreted as the bean name
to be injected. You can say, it follows
by-name autowiring semantics as demonstrated in the below example:

If no 'name' is specified explicitly, the default name is derived from the field name or setter method.
In case of a
field, it takes the field name; in case of a setter method, it takes the bean property name.
 */
public class TextEditor {
   private SpellChecker spellChecker;

   @Resource(name= "spellChecker")
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker(){
      return spellChecker;
   }
   public void spellCheck(){
      spellChecker.checkSpelling();
   }
}