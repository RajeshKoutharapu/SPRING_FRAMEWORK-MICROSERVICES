package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;

@RestController
public class MainController {
     @Autowired
	feignclientinterface client;
	@GetMapping("/getcar")
	public String getcar() {
		
		return  client.getbikeapi() +" HELLO WE ARE ALSO INVENTED THE CAR SERVICES";
	}
}
