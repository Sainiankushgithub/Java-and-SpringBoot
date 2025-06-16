package com.websearch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.websearch.controller")
public class ConfigFile implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vw = new InternalResourceViewResolver();
		vw.setPrefix("/WEB-INF/Jsp/");
		vw.setSuffix(".jsp");
		return vw;
	}
	
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		// 10 MB Limit
		resolver.setMaxUploadSize(10*1024*1024);
		return resolver;
		
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		
	}
}
