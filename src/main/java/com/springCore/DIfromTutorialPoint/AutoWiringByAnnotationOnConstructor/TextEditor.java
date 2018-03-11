package com.springCore.DIfromTutorialPoint.AutoWiringByAnnotationOnConstructor;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chetan on 30/10/16.
 */


public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}