package com.progrank.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.progrank.model.User;

public class UserDaoImpl implements UserDao{
	
	private JdbcTemplate jdbcTemplate;
	

	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int insert(User user) {
		String query="INSERT INTO User(name,email,password)VALUES(?,?,?)";
		int result=jdbcTemplate.update(query,user.getName(),user.getEmail(),user.getPassword());
		return result;
	}
	
}
