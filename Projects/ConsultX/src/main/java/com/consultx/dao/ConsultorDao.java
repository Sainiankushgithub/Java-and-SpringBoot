package com.consultx.dao;

import com.consultx.entities.Consultor;

public interface ConsultorDao {
	int insert(Consultor consultor);
	Consultor getUserByEmail_Number(String email, String number,String password);
}
