package com.SpringMongodb.UsingMongoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringMongodb.UsingMongoDb.dao.details;
import com.SpringMongodb.UsingMongoDb.service.inplemnetation;

@SpringBootApplication
public class UsingMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext conatiner=SpringApplication.run(UsingMongoDbApplication.class, args);
		inplemnetation bean=conatiner.getBean(inplemnetation.class);
		details obj=new details(30,"nizampet","Hydrabad");
		bean.insertvalues(obj);
		bean.getAlldetails();
		
	}

}
