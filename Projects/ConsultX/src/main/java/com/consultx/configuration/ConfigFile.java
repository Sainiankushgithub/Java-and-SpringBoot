package com.consultx.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.consultx.dao.UserDao;
import com.consultx.dao.UserDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.consultx.controllers")
public class ConfigFile implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/Jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
//  Driver Manager Data Source 
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/consultx");
		ds.setUsername("root");
		ds.setPassword("Ankush");
		return ds;
	}
//    JDBC Template 
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
//    USER Implementations
	@Bean
	public UserDao getUserDao(JdbcTemplate jdbcTemplate) {
		return new UserDaoImpl(jdbcTemplate);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry
	        .addResourceHandler("/ConsultX/**")
	        .addResourceLocations("/ConsultX/")
	        .resourceChain(true);
	}

}
