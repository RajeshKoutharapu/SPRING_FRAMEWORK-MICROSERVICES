package com.SpringBoot.SpringDataJDBC_H2DB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.SpringDataJDBC_H2DB.persistence.Jdbc;

@SpringBootApplication
public class SpringDataJdbcH2DbApplication {

	public static void main(String[] args) {
		ApplicationContext container =SpringApplication.run(SpringDataJdbcH2DbApplication.class, args);
		Jdbc obj=container.getBean(Jdbc.class);
		obj.insert(1,"rajesh",2);
		obj.insert(2,"mahesh",5);
		obj.insert(1,"suresh",4);
	}

}
