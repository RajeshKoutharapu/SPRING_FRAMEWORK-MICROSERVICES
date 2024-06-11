package com.SpringRest.basicRestApi_Eg.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {
	@GetMapping("/welcome")
	public String getGreeting(String name) {
		String res=null;
		LocalDateTime localDate=LocalDateTime.now();
		int hour=localDate.getHour();
		if(hour<12) {
			res="GOOD MORNING";
		}else if(hour<16)
			res="GOOD AFTERNOON";
		else if(hour<20)
			res="GOOD EVENING";
		else
			res="GOOD NIGHT";
		
	 String res1="hello "+name+" "+res;	
		return res1;
	}

}
