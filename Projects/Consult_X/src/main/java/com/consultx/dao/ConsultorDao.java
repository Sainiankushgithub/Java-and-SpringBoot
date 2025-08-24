package com.consultx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.consultx.entities.Consultor;

@Repository
public class ConsultorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // RowMapper for Consultor
    private static class ConsultorRowMapper implements RowMapper<Consultor> {
        @Override
        public Consultor mapRow(ResultSet rs, int rowNum) throws SQLException {
            Consultor c = new Consultor();
            c.setName(rs.getString("name"));
            c.setEmail(rs.getString("email"));
            c.setNumber(rs.getString("number"));
            c.setPassword(rs.getString("password"));
            c.setSpecialization(rs.getString("specialization"));
            c.setExperience(rs.getString("experience"));
            return c;
        }
    }

    // Save Consultor
    public int saveConsultor(Consultor consultor) {
        String sql = "INSERT INTO consultor (name, email, number, password, specialization, experience) VALUES (?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(
            sql,
            consultor.getName(),
            consultor.getEmail(),
            consultor.getNumber(),
            consultor.getPassword(),
            consultor.getSpecialization(),
            consultor.getExperience()
        );
    }

    // Fetch user by email or phone and password
    public Consultor getUserByEmail_Number(String email, String number, String password) {
        String sql = "SELECT * FROM consultor WHERE (email = ? OR number = ?) AND password = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new ConsultorRowMapper(), email, number, password);
        } catch (EmptyResultDataAccessException e) {
            return null; // no user found
        }
    }

    // Fetch all consultors
    public List<Consultor> getAllConsultors() {
        String sql = "SELECT * FROM consultor";
        return jdbcTemplate.query(sql, new ConsultorRowMapper());
    }
}
