package com.springCore.CircularDependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chetan on 6/4/18.
 */
@Configuration
@ComponentScan(basePackages = { "com.springCore.CircularDependency" })
public class TestConfig {

}
