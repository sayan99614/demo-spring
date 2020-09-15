package com.main;

import org.springframework.jdbc.core.JdbcTemplate;

public class Studentdaoimpl implements Studentdao {
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query="insert into student(id,name,age) values(?,?,?)";
		int result = jdbcTemplate.update(query,student.getId(),student.getName(),student.getAge());
		return result;
	}
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

}
