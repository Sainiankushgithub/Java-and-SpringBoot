package com.spring.orm.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.spring.orm")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class ConfigFile {
	
	@Bean
	public DataSource getDataSource() {
		BasicDataSource bs = new BasicDataSource();
		bs.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bs.setUrl("jdbc:mysql://localhost:3306/springorm");
		bs.setUsername("root");
		bs.setPassword("Ankush");
		return bs;
	}
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new  LocalSessionFactoryBean();
		Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.show_sql", "true");
		factoryBean.setDataSource(getDataSource());
		factoryBean.setHibernateProperties(props);
		factoryBean.setPackagesToScan("com.spring.orm.entities");
		return factoryBean;
	}
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
	
}
