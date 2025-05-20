package com.spring.jdbc.dao;

import java.util.List;
import com.spring.jdbc.entities.Student;

public interface StudentDao {
    int insert(Student student);
    Student getStudent(int id);
    List<Student> getAllStudents();
}
