package com.consultx.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.consultx.entities.Users;

public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insert(Users users) {
		String query="INSERT INTO users (name,email,phone_no, password ) VALUES(?,?,?,?)";
		int result=jdbcTemplate.update(query,users.getName(),users.getEmail(),users.getPhone_no(),users.getPassword());
		return result;
	}

}
