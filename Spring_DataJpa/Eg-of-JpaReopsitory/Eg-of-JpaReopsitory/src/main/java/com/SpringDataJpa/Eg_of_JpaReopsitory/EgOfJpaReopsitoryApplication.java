package com.SpringDataJpa.Eg_of_JpaReopsitory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.Eg_of_JpaReopsitory.service.implementation;

@SpringBootApplication
public class EgOfJpaReopsitoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(EgOfJpaReopsitoryApplication.class, args);
		implementation bean=container.getBean(implementation.class);
	 List<Integer> list=new ArrayList<>();
	 list.add(2);
	 list.add(3);
	 list.add(4);
		bean.getallbyid(list);
	}

}
