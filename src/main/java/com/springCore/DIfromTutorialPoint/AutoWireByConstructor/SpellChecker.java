package com.springCore.DIfromTutorialPoint.AutoWireByConstructor;

/**
 * Created by chetan on 30/10/16.
 */
//The instance will be created in xml file
    /*
    <bean id="spellChecker" class="com.springCore.DIfromTutorialPoint.DIByConstructor.SpellChecker">
   </bean>
     */
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor.");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }

}
