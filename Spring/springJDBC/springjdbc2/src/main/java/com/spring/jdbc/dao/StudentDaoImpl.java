package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Address;
import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		String query="INSERT INTO college_std(id,name,age,address) VALUES(?,?,?,?)";
		int result=jdbcTemplate.update(query,student.getId(),student.getName(),student.getAge(),student.getAddress_id());
		return result;
	}

	@Override
	public Student getStudent(int id) {
		String query=" SELECT * FROM college_std WHERE id =?";
		return jdbcTemplate.queryForObject(query,new RowMapper<Student>(){
			public Student mapRow(ResultSet rs, int RowNum)throws SQLException{
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setAddress_id(rs.getInt("address_id"));
				
				AddressDao addressDao = new AddressDaoImpl(jdbcTemplate);
				Address addr =addressDao.getAddress(s.getAddress_id());
				s.setAddress(addr);
				return s;
			}
		},id);
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		
		return null;
	}
	
}
