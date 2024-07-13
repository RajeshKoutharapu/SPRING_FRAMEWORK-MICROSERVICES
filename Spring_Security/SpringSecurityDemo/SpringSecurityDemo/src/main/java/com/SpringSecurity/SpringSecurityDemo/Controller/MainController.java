package com.SpringSecurity.SpringSecurityDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
@GetMapping("/info")
	public String getinfo() {
		return "Hello Developers This Is Java Backend Developer";
	}
@GetMapping("/data")
	public String data() {
		return "I am rajesh from guntur good luck for you test";
	}
}
