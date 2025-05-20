package com.spring.jdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.AddressDao;
import com.spring.jdbc.dao.AddressDaoImpl;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class config {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Ankush");
		return ds;
	}
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	@Bean
    public StudentDao getStudentDao() {
        return new StudentDaoImpl(getJdbcTemplate());
    }

    @Bean
    public AddressDao getAddressDao() {
        return new AddressDaoImpl(getJdbcTemplate());
    }
}
