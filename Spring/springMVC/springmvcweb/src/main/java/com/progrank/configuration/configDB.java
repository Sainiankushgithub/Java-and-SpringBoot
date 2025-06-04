package com.progrank.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.progrank.dao.UserDao;
import com.progrank.dao.UserDaoImpl;

@Configuration
public class configDB {
	
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
