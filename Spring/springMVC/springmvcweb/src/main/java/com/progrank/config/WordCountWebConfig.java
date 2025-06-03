package com.progrank.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WordCountWebConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webAC= new AnnotationConfigWebApplicationContext();
		webAC.register(SpringApplicationConfig.class);
		
		DispatcherServlet ds = new DispatcherServlet(webAC);
		ServletRegistration.Dynamic servlet = servletContext.addServlet("Myds", ds);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}

}
