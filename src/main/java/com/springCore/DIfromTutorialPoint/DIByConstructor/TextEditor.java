package com.springCore.DIfromTutorialPoint.DIByConstructor;

/**
 * Created by chetan on 30/10/16.
 */
public class TextEditor {
    private SpellChecker spellChecker;
//spellchecker is to be injected
//The xml line is <constructor-arg ref="spellChecker"/>
    //We see here that in the constructor spell checkere is there
    //In normal programming we do
    //SpellChecker sp= new SpellChecker()
    //but here we get instance injected
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        /*
        As per defintion "Constructor-based DI is accomplished when the container invokes a
        class constructor with a number of arguments, each representing a
         dependency on other class."
         */

        //In the aregument of constructor we see Spoellchecker which is the d
        // ependenncy of other class being talked about
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        //This will be called from Main App and here spellchecker instance is obtained via spring containr
        //The xml line is <constructor-arg ref="spellChecker"/>
        //where ref points to the spellchecker bean whose instance is created by DIcontainer
        spellChecker.checkSpelling();
    }
}
