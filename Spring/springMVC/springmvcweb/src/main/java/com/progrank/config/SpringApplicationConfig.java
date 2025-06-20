package com.progrank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.progrank.controller")
public class SpringApplicationConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vw= new InternalResourceViewResolver();
		vw.setPrefix("/WEB-INF/jsp/");
		vw.setSuffix(".jsp");
		return vw;
	}

}
