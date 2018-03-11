package com.springCore.DIfromTutorialPoint.AutoWiringByAnnotationOnSetterMethods;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */
public class TextEditor {
   private SpellChecker spellChecker;

   @Autowired
   public void setSpellChecker( SpellChecker spellChecker ){
      this.spellChecker = spellChecker;
   }
   public SpellChecker getSpellChecker( ) {
      return spellChecker;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}