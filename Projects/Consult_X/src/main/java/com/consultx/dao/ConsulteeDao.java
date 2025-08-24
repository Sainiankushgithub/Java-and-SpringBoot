package com.consultx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.consultx.entities.Consultee;

@Repository
public class ConsulteeDao {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // RowMapper for Consultee
    private static class ConsulteeRowMapper implements RowMapper<Consultee> {
        @Override
        public Consultee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Consultee c = new Consultee();
            c.setName(rs.getString("name"));
            c.setEmail(rs.getString("email"));
            c.setNumber(rs.getString("number"));
            c.setPassword(rs.getString("password"));
            return c;
        }
    }

    // Save Consultee
    public int saveConsultee(Consultee consultee) {
        String sql = "INSERT INTO consultee (name, email, number, password) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(
            sql, 
            consultee.getName(), 
            consultee.getEmail(), 
            consultee.getNumber(), 
            consultee.getPassword()
        );
    }

    // Fetch user by email or phone and password
    public Consultee getUserByEmail_Number(String email, String number, String password) {
        String sql = "SELECT * FROM consultee WHERE (email = ? OR number = ?) AND password = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new ConsulteeRowMapper(), email, number, password);
        } catch (EmptyResultDataAccessException e) {
            return null; // no user found
        }
    }

    // Optional: fetch all consultees
    public List<Consultee> getAllConsultees() {
        String sql = "SELECT * FROM consultee";
        return jdbcTemplate.query(sql, new ConsulteeRowMapper());
    }
}
