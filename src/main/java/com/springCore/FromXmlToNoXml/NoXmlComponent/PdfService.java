package com.springCore.FromXmlToNoXml.NoXmlComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chetan on 26/12/16.
 */
@Component
public class PdfService {

    @Autowired
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
