package com.spring.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="job_detail")
public class JobDetail {
	@Id
	private int id;
	private int salary;
	private String location;
	private String domain;
	public JobDetail() {
		
	}
	@Autowired
	public JobDetail(@Value("${job.id}")int id,
					@Value("${job.salary}")int salary,
					@Value("${job.location}")String location,
					@Value("${job.domain}")String domain) {
		this.id=id;
		this.salary=salary;
		this.location=location;
		this.domain=domain;
		
	}
	@Override
	public String toString() {
		return "JobDetail [id=" + id + ", salary=" + salary + ", location=" + location + ", domain=" + domain + "]";
	}
	
}
