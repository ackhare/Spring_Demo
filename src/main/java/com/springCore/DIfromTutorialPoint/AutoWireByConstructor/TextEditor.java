package com.springCore.DIfromTutorialPoint.AutoWireByConstructor;


/**
 * Created by chetan on 30/10/16.
 */
public class TextEditor {
   private SpellChecker spellChecker;
   private String name;
//constructor injection of name and spell checker instance coming via autowiring
   public TextEditor( SpellChecker spellChecker, String name ) {
      this.spellChecker = spellChecker;
      this.name = name;
   }
   public SpellChecker getSpellChecker() {
      return spellChecker;
   }
   public String getName() {
      return name;
   }

   public void spellCheck() {
      //both are vbeing injected
      spellChecker.checkSpelling();
      System.out.println(name);
   }
}