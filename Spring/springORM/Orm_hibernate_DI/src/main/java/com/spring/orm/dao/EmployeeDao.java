package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.orm.entities.Employee;

@Repository
public class EmployeeDao {
	private SessionFactory sessionFactory;

	@Autowired
	public EmployeeDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public int saveEmployee(Employee employee) {
		return (Integer) sessionFactory.getCurrentSession().save(employee);
	}
}
