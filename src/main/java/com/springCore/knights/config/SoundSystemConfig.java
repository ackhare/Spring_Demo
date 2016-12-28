package com.springCore.knights.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springCore.knights",
               excludeFilters = { @Filter(Configuration.class) })
public class SoundSystemConfig {
}
