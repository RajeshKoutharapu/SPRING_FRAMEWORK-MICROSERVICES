package com.SpringRest.Api_Json_Api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerClass {
	
	@GetMapping("/details")
	public ResponseEntity<modelClass> getdeatils() {
		
		modelClass obj=new modelClass();
		obj.setId(2);
		obj.setName("rajesh");
		obj.setCity("Ongole");
		return new ResponseEntity<modelClass>(obj,HttpStatus.OK);
	}
	
	@PostMapping("/setdetails")
	public String Setdetails(@RequestBody modelClass model) {
		System.out.println(model);
		return "Data transfered to controller as jva object";
	}

}
