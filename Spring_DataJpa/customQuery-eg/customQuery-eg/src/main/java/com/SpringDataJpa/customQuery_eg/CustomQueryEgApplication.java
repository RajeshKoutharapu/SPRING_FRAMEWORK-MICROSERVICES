package com.SpringDataJpa.customQuery_eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.customQuery_eg.service.implementation;

@SpringBootApplication
public class CustomQueryEgApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(CustomQueryEgApplication.class, args);
		
		implementation bean=container.getBean(implementation.class);
		bean.getdetailsbyPrice(249,299);
		bean.getitemlistonExisted("yes");
		bean.updateitemlist("no","Rogan Josh");	}

}
