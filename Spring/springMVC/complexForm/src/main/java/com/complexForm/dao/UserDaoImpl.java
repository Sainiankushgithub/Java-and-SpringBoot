package com.complexForm.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.complexForm.entities.User;

public class UserDaoImpl implements UserDao{
	
	private JdbcTemplate jdbcTemplate;
	

	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(User user) {
		String query="INSERT INTO user_detail (name, email, password, age, gender, street, city, dob, courses,type) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?,?, ?,?)";
		int result= jdbcTemplate.update(query,user.getName(),user.getEmail(),user.getPassword(),user.getAge(),user.getGender(),user.getAddress().street,user.getAddress().city,user.getDob(),user.getCourse(),user.getType());
		return result;
	}
}
