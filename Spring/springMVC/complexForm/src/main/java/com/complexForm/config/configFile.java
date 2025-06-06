package com.complexForm.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.complexForm.dao.UserDao;
import com.complexForm.dao.UserDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.complexForm.controllers")
public class configFile {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver rv = new InternalResourceViewResolver();
		rv.setPrefix("/WEB-INF/Jsp/");
		rv.setSuffix(".jsp");
		return rv;
	}
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/User");
		ds.setUsername("root");
		ds.setPassword("Ankush");
		return ds;
	}
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	@Bean
	public UserDao getUserDao() {
		return new UserDaoImpl(getJdbcTemplate());
	}
}
