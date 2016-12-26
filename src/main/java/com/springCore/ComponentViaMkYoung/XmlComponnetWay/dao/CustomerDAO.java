package com.springCore.ComponentViaMkYoung.XmlComponnetWay.dao;

/**
 * Created by chetan on 26/12/16.
 */
import org.springframework.stereotype.Component;
//even iof you remove this annotation from here it will not have any impact because this is defined
@Component
public class CustomerDAO
{
    @Override
    public String toString() {
        return "Hello , This is CustomerDAO";
    }
}
