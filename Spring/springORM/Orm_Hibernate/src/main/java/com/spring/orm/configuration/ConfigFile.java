package com.spring.orm.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.hibernate.SessionFactory;   
import com.spring.orm.entities.Address;
import com.spring.orm.entities.Student;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "com.spring.orm.dao")
public class ConfigFile {
	@Bean
    public DataSource dataSource() {
		BasicDataSource ds = new  BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springorm");
		ds.setUsername("root");
		ds.setPassword("Ankush");
		return ds;
    }
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.show_sql", "true");
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan("com.spring.orm.entities");
		factoryBean.setHibernateProperties(props);
		return factoryBean;
	}
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
	    return new HibernateTransactionManager(sessionFactory);
	}
	@Bean
	public Address getAddress() {
		return new Address("Jammu", "J&K", 180003);
	}
	@Bean
	public Student getStudent(Address address) {
		return new Student("Ankush saini", 22, "c++ programing", address);
	}

}
