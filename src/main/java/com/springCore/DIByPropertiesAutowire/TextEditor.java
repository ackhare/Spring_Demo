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

/*

The intent is DIByPropertiesAutowire
So when the spellchecker is injected inro texteditor then it is annotated by auto wired and so bean body is not given


 */