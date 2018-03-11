package com.springCore.DIfromTutorialPoint.AutoWiringByAnnotationOnProperties;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */
public class TextEditor {

   @Autowired
   private SpellChecker spellChecker;



   public SpellChecker getSpellChecker( ) {
      return spellChecker;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}