package com.consultx.dao;

import com.consultx.entities.Consultee;

public interface  ConsulteeDao {
	int insert(Consultee consultee);
	Consultee getUserByEmail_Number(String email, String number,String password);
}	