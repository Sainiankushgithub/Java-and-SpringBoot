package com.consultx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.consultx.entities.Users;


public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Users users) {
		String query = "INSERT INTO users (name,email,phone_no, password ) VALUES(?,?,?,?)";
		int result = jdbcTemplate.update(query, users.getName(), users.getEmail(), users.getPhone_no(),
				users.getPassword());
		return result;
	}

	@Override
	public Users getUserByEmailOrPhoneAndPassword(String email_phone, String password) {
		String query = "SELECT * FROM users WHERE (email=? OR phone_no=?) AND password=?";
		try {
			return jdbcTemplate.queryForObject(query, new RowMapper<Users>() {
				public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
					Users user = new Users();
					user.setName(rs.getString("name"));
					user.setEmail(rs.getString("email"));
					user.setPhone_no(rs.getString("phone_no"));
					user.setPassword(rs.getString("password"));
					return user;
				}
			}, email_phone, email_phone, password);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
