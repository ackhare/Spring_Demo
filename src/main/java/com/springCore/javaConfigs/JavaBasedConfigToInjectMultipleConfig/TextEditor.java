package com.springCore.javaConfigs.JavaBasedConfigToInjectMultipleConfig;

/**
 * Created by chetan on 19/12/16.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}