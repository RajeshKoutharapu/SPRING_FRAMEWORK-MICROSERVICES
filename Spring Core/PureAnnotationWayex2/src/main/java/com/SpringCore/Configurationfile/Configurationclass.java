package com.SpringCore.Configurationfile;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.SpringCore.Service"})
public class Configurationclass {
	@Bean
  public LocalDateTime getbean() {
	  return LocalDateTime.now();
  }
	
}
