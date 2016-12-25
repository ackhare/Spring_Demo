package com.springCore.JSR250.PostConstructPreDestroy;

/**
 * Created by chetan on 19/12/16.
 */

import javax.annotation.*;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
/*
You can use @PostConstruct annotation as an alternate of initialization callback and @PreDestroy annotation as an
alternate of destruction callback as explained in the below example.
 */
    public String getMessage() {
        System.out.println("Your Message : " + message);
        return message;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}