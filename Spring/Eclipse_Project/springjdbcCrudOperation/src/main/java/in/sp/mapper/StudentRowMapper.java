package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;

public class StudentRowMapper implements RowMapper<Student>
{
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std=new Student();
		std.setStd_roll(rs.getInt("std_roll"));
		std.setStd_name(rs.getString("std_name"));
		std.setStd_marks(rs.getInt("std_marks"));
		return std;
	}
}