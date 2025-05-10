package com.microservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {

	@GetMapping("/m2")
	public String demo() {
		return"in microservice 2";
	}
}
