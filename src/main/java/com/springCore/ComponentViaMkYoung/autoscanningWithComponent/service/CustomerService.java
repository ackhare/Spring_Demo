package com.springCore.ComponentViaMkYoung.autoscanningWithComponent.service;

/**
 * Created by chetan on 26/12/16.
 */

import com.springCore.ComponentViaMkYoung.autoscanningWithComponent.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//DAO layer, add @Component to indicate this is an auto scan component also.

@Component
public class CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Override
    public String toString() {
        return "CustomerService [customerDAO=" + customerDAO + "]";
    }
}