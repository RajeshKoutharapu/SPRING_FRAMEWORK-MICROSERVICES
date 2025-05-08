package com.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

	@GetMapping("m1")
	public String demo() {
		return "in microservice 1";
	}
}
