package com.springCore.ComponentViaMkYoung.XmlComponnetWay.service;

/**
 * Created by chetan on 26/12/16.
 */

import com.springCore.ComponentViaMkYoung.XmlComponnetWay.dao.CustomerDAO;


public class CustomerService {
    //dependency injected
    CustomerDAO customerDAO;

    //setter injection as wee can see in xml
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public String toString() {
        return "CustomerService [customerDAO=" + customerDAO + "]";
    }

}