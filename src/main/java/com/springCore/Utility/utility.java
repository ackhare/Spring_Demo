package com.springCore.Utility;

import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by chetan on 19/12/16.
 */
//TODO need of this class has faded because putting anything directly under resoiurces puts it directly on class path
public class utility {

    public static void  loadLogger()
    {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("/home/chetan/Downloads/Spring-Core-master/log4j.properties"));
        } catch (Exception e) {
//            log.error(e);
        }
        PropertyConfigurator.configure(props);
    }
}
