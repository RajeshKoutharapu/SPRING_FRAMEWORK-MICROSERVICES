package com.SpringBoot.SpringcorewithBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.SpringBoot.service.Parcelcounter;

@SpringBootApplication
@ComponentScan(basePackages = "com.SpringBoot")
public class SpringcorewithBootApplication {

	public static void main(String[] args) {
		ApplicationContext container=SpringApplication.run(SpringcorewithBootApplication.class, args);
		Parcelcounter obj=container.getBean(Parcelcounter.class);
		obj.packingdone();
		
		
		
	}

}
