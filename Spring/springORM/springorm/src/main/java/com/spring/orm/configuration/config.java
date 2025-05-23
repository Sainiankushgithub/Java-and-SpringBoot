package com.spring.orm.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

@Configuration
public class config {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Ankush");
		return ds;
	}
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		
		Properties props = new Properties();
		props.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
		props.put("hibernate.hbm2ddl.auto","update");
		props.put("hibernate.show_sql", "true");
		
		factory.setHibernateProperties(props);
		factory.setAnnotatedClasses(Student.class);
		return factory;
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate() {
		return new HibernateTemplate(getSessionFactory().getObject());
	}
	
	@Bean
	public StudentDao getStudentDao() {
		return new StudentDao(getHibernateTemplate());
	}
}
