package in.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class springConfig {
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db"); // localhost with data base name
		dataSource.setUsername("root");
		dataSource.setPassword("Ankush");
		return dataSource;
	}

	@Bean
	public NamedParameterJdbcTemplate myJdbcTemplate() {
		NamedParameterJdbcTemplate jdbctemplate = new NamedParameterJdbcTemplate(myDataSource());
		return jdbctemplate;
	}
}
