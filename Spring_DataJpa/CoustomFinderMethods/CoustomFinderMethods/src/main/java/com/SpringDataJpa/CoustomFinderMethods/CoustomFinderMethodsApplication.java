package com.SpringDataJpa.CoustomFinderMethods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.CoustomFinderMethods.service.implementation;

@SpringBootApplication
public class CoustomFinderMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(CoustomFinderMethodsApplication.class, args);
		implementation bean=container.getBean(implementation.class);
		bean.fetchByprice(80);
		bean.fetchBypriceBetween(20,200);
		bean.fetchBypriceAndname(80,"coldtb");
		
	}

}
