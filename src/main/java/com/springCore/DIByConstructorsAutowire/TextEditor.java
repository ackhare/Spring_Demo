package com.springCore.DIByConstructorsAutowire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 30/10/16.
 */
@Component
public class TextEditor {
   private SpellChecker spellChecker;
/*
 A constructor @Autowired annotation indicates that the constructor should be autowired when creating the bean, even if
no <constructor-arg> elements are used while configuring the bean in XML file.
 */
@Autowired
public TextEditor(SpellChecker spellChecker){
   System.out.println("Inside TextEditor constructor." );
   this.spellChecker = spellChecker;
}

   public void spellCheck(){
      spellChecker.checkSpelling();
   }
}