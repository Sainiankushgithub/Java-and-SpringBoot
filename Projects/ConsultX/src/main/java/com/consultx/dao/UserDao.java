package com.consultx.dao;

import com.consultx.entities.Users;

public interface UserDao {
	
	int insert(Users users);
	Users getUserByEmailOrPhoneAndPassword(String email_phone,String password);
}
