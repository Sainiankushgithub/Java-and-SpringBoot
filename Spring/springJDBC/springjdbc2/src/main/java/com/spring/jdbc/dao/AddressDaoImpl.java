package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Address;

public class AddressDaoImpl implements AddressDao {
	private JdbcTemplate jdbcTemplate;
	public AddressDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public int insert(Address address) {
		String query ="INSERT INTO address (id,street,city,state,zip_code) VALUES (?,?,?,?,?)";
		int result= jdbcTemplate.update(query,address.getId(),address.getStreet(),address.getCity(),address.getState(),address.getZip_code());
		return result;
	}

	@Override
	public Address getAddress(int id) {
		String query="SELECT * FROM  address where id=?";
		return jdbcTemplate.queryForObject(query, new RowMapper<Address>() {
			public Address mapRow(ResultSet rs,int RowNum)throws SQLException{
				Address a = new Address();
				a.setId(rs.getInt("id"));
				a.setStreet(rs.getString("street"));
				a.setCity(rs.getString("city"));
				a.setState(rs.getString("state"));
				a.setZip_code(rs.getString("zip_code"));
				return a;
			}
		},id);
	}

}
