package com.spring.dao;


import java.util.List;

import com.spring.entities.Student;

public interface StudentDao {
	int insert(Student student);
	Student getStudent(int id);
	List<Student>getAllStudent();
}
