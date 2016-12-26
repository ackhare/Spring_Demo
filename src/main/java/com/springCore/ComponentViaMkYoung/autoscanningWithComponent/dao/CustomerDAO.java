package com.springCore.ComponentViaMkYoung.autoscanningWithComponent.dao;

/**
 * Created by chetan on 26/12/16.
 */
import org.springframework.stereotype.Component;

//Annotate with @Component to indicate this is class is an auto scan component.
@Component
public class CustomerDAO
{
    @Override
    public String toString() {
        return "Hello , This is CustomerDAO";
    }
}
