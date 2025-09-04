package com.spring.orm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

@Repository
public class StudentDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public StudentDao(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public int insert(Student student) {
		Session session = sessionFactory.getCurrentSession();
		return (int) session.save(student);
	}
	@Transactional(readOnly=true)
	public Student getById(int id) {
		return sessionFactory.getCurrentSession().get(Student.class,id);
	}

}
