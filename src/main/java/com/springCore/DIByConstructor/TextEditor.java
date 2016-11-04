package com.springCore.DIByConstructor;

/**
 * Created by chetan on 30/10/16.
 */
public class TextEditor {
    private SpellChecker spellChecker;
//spellchecker is to be injected
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
