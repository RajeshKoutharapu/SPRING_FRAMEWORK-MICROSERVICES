package com.SpringAop.SpringAopEg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopEgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopEgApplication.class, args);
	}

}
