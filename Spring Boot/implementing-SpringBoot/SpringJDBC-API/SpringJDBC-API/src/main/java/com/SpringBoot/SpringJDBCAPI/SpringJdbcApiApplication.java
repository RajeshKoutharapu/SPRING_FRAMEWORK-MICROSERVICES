package com.SpringBoot.SpringJDBCAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.SpringJDBCAPI.perisistence.Daoclass;

@SpringBootApplication
public class SpringJdbcApiApplication {

	public static void main(String[] args) {
		ApplicationContext container =SpringApplication.run(SpringJdbcApiApplication.class, args);
		Daoclass obj=container.getBean(Daoclass.class);
		obj.printitems();
		
	}

}
