package com.springcore.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.springcore.entities")
@PropertySource("classpath:application.properties")
public class ConfigFile {

}
