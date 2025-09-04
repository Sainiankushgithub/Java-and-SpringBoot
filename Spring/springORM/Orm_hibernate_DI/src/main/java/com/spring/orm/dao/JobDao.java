package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.orm.entities.JobDetail;

@Repository
public class JobDao {
	private SessionFactory sessionFactory;
	@Autowired
	public JobDao(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public int saveJob(JobDetail job) {
		return (Integer) sessionFactory.getCurrentSession().save(job);
	}
}
