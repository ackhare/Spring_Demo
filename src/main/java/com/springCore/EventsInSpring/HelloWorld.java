package com.springCore.EventsInSpring;

/**
 * Created by chetan on 19/12/16.
 */

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
