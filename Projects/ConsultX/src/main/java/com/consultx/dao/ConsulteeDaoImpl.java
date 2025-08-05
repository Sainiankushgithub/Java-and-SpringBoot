package com.consultx.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.consultx.entities.Consultee;

@Repository
public class ConsulteeDaoImpl implements ConsulteeDao {

    private  JdbcTemplate jdbcTemplate;

    public ConsulteeDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Consultee consultee) {
        String query = "INSERT INTO Consultee (name, email, number, password) VALUES (?, ?, ?, ?)";
        try {
        	return jdbcTemplate.update(query,
                    consultee.getName(),
                    consultee.getEmail(),
                    consultee.getNumber(),
                    consultee.getPassword());
        }catch(Exception e) {
        	e.printStackTrace();
        	return 0;
        }
    }

    @Override
    public Consultee getUserByEmail_Number(String email, String number,String passsword) {
        String query="SELECT * FROM Consultee WHERE (email=? OR number = ?) AND password=?";
        try {
        	return jdbcTemplate.queryForObject(query, new RowMapper<Consultee>() {

				@Override
				public Consultee mapRow(ResultSet rs, int rowNum) throws SQLException {
					Consultee c = new Consultee();
					c.setName(rs.getString("name"));
			        c.setEmail(rs.getString("email"));
			        c.setNumber(rs.getString("number"));
			        c.setPassword(rs.getString("password"));
			        return c;
				}
        		
        	},email,number,passsword);	
        }catch(Exception e) {
        	e.printStackTrace();
        	return null;
        }
    }
}
