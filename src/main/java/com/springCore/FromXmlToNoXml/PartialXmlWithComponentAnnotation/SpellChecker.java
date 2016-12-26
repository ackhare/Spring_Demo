package com.springCore.FromXmlToNoXml.PartialXmlWithComponentAnnotation;

import org.springframework.stereotype.Component;

/**
 * Created by chetan on 26/12/16.
 */

@Component
public class SpellChecker {

    public void spellCheck()
    {
        System.out.println("I did spellCheck");
    }

}
