package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.entities.Student;
@Component
public class studentImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int insert(Student student) {
		String query="INSERT INTO student (id, name,city) VALUES (?,?,?)";
		return jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	}

	@Override
	public Student getStudent(int id) {
		String query ="SELECT * FROM student WHERE id=?";
		return jdbcTemplate.queryForObject(query,new RowMapper<Student>(){
			public Student mapRow(ResultSet rs, int rowNum)throws SQLException{
				Student s= new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setCity(rs.getString("city"));
				return s;
			}
		},id);
	}

	@Override
	public List<Student> getAllStudent() {
		String query="SELECT * FROM student";
		return jdbcTemplate.query(query, new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setCity(rs.getString("city"));
				return s;
			}
		});
	}

}
