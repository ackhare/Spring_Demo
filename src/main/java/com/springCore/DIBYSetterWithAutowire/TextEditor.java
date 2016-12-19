package com.springCore.DIBYSetterWithAutowire;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */
/*
You can use @Autowired annotation on setter methods to get rid of the <property> element in XML configuration file. When
Spring finds an @Autowired annotation used with setter methods, it tries to perform byType autowiring on the method.
 */
public class TextEditor {
   private SpellChecker spellChecker;

   // a setter method to inject the dependency., here byType is used
   @Autowired
   public void setSpellChecker(SpellChecker spellChecker) {
      System.out.println("Inside setSpellChecker." );
      this.spellChecker = spellChecker;
   }
   // a getter method to return spellChecker
   public SpellChecker getSpellChecker() {
      return spellChecker;
   }

   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}