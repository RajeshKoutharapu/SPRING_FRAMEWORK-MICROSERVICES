package com.DataJpa.SpringbootProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DataJpa.SpringbootProfiles.service.course;


@SpringBootApplication
public class SpringbootProfilesApplication implements  CommandLineRunner{
@Autowired
	course c;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfilesApplication.class, args);
	
	
			
  
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		  c.getcourse();
	}

}
