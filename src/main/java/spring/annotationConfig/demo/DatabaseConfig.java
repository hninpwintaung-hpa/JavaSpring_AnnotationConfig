package spring.annotationConfig.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=JAVAWEB;encrypt=true;trustServerCertificate=true");
	        dataSource.setUsername("sa");
	        dataSource.setPassword("123@ace");
	        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        return dataSource;
	    }

	    @Bean
	    public JdbcTemplate jdbcTemplate() {
	        return new JdbcTemplate(dataSource());
	    }
}
