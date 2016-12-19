package com.springCore.DIByPropertiesAutowire;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */
/*
You can use @Autowired annotation on properties to get rid of the setter methods

 */

public class TextEditor {
   @Autowired
   private SpellChecker spellChecker;

   public TextEditor() {
      System.out.println("Inside TextEditor constructor." );
   }

   public SpellChecker getSpellChecker( ){
      return spellChecker;
   }

   public void spellCheck(){
      spellChecker.checkSpelling();
   }
}