package com.SpringBoot.SpringDataJDBC_H2DB.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Jdbc {
	private static final String SQLup = "INSERT INTO students (id, name, class) VALUES (?,?,?)";
	@Autowired
	private JdbcTemplate con;
	public void insert(int id,String name,int Class) {
		con.update(SQLup,id,name,Class);
	}
	
	

}
