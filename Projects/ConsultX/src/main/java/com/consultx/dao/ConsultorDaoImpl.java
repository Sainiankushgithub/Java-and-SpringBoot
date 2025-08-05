package com.consultx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.consultx.entities.Consultor;

@Repository
public class ConsultorDaoImpl implements ConsultorDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public ConsultorDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}
	@Override
	public int insert(Consultor consultor) {
		String query="INSERT INTO Consultor (name , email, number , password , specialization , experience )VALUES (?,?,?,?,?,?)";
		try {
			int result=jdbcTemplate.update(query,
					consultor.getName(),
					consultor.getEmail(),
					consultor.getNumber(),
					consultor.getPassword(),
					consultor.getSpecialization(),
					consultor.getExperience());
			return result;
			
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Consultor getUserByEmail_Number(String email, String number, String password) {
		String query="SELECT * FROM Consultor WHERE (email=? OR number=?) AND password=?";
		try {
			return jdbcTemplate.queryForObject(query, new RowMapper<Consultor>() {
			    @Override
			    public Consultor mapRow(ResultSet rs, int rowNum) throws SQLException {
			        Consultor c = new Consultor();
			        c.setName(rs.getString("name"));
			        c.setEmail(rs.getString("email"));
			        c.setNumber(rs.getString("number"));
			        c.setPassword(rs.getString("password"));
			        return c;
			    }
			}, email, number, password);
		}catch(Exception e) {
			return null;
		}
	}

}
