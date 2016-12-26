package com.springCore.FromXmlToNoXml.FullXmlBasedConfig;

/**
 * Created by chetan on 26/12/16.
 */
public class PdfService {

    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void readPdf()
    {
        //your complex logic for reading pdf
        spellChecker.spellCheck();
        System.out.println("I read the pdf");

    }
}
