package com.SpringRest.basicRestApi_Eg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.basicRestApi_Eg.pojo.details;

@RestController
@RequestMapping("/api1")
public class Detailscontroller {
@GetMapping("/details")
public details getdeatils() {
	details obj=new details();
	obj.setId(1);
	obj.setName("Rajesh");
	obj.setCity("ongole");
	obj.setRole("Developer");
	return obj;
}
}
