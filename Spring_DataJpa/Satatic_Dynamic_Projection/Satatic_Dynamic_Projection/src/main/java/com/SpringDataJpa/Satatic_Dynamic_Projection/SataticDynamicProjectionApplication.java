package com.SpringDataJpa.Satatic_Dynamic_Projection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.Satatic_Dynamic_Projection.service.implementation;
import com.SpringDataJpa.Satatic_Dynamic_Projection.service.implementationinterface;

@SpringBootApplication
public class SataticDynamicProjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =SpringApplication.run(SataticDynamicProjectionApplication.class, args);
		  implementation bean=container.getBean(implementation.class);
		  bean.StaticprojectionByid(4);
		  bean.DynamicProjectionByprice(80);
		
	}

}
