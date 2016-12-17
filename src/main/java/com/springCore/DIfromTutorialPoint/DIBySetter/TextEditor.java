package com.springCore.DIfromTutorialPoint.DIBySetter;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */
public class TextEditor {
    private SpellChecker spellChecker;
//   <bean id="textEditor" class="com.springCore.DIfromTutorialPoint.DIBySetter.TextEditor">
//      <property name="spellChecker" ref="spellChecker"/>
//      <!--referring to the below bean-->
//   </bean>

    //This is how we will inject spellchecker via container
    // a setter method to inject the dependency.of spellchecker
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
/*
        //This will be called from Main App and here spellchecker instance is obtained via spring containr
        //The xml line is <property name="spellChecker" ref="spellChecker"/>
        //where ref points to the spellchecker bean whose instance is created by DIcontainer
 */
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}