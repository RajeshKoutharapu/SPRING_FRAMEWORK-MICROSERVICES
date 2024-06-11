package com.SpringDataJpa.Demo_DataJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.Demo_DataJpa.persistence.demodetails;
import com.SpringDataJpa.Demo_DataJpa.persistence.repositoryinterface;

@SpringBootApplication
public class DemoDataJpaApplication{
	public static void main(String[] args) {
		
		ConfigurableApplicationContext container=SpringApplication.run(DemoDataJpaApplication.class, args);
		repositoryinterface bean=container.getBean(repositoryinterface.class);
	    demodetails obj=new demodetails(2,"suresh",10);
		 bean.save(obj);
	}

}
