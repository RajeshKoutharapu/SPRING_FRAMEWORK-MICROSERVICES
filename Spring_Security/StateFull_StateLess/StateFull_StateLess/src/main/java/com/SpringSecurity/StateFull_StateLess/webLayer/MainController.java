package com.SpringSecurity.StateFull_StateLess.webLayer;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class MainController {
	List<modelClass> list=new ArrayList<>();
	@GetMapping("/get")

	public List<modelClass>dataAdded() {
		
		 list.add( new modelClass("Rajesh","dev",50000,"hyd"));
		 list.add( new modelClass("Ramesh","dev",50000,"hyd"));
		 list.add( new modelClass("geetha","dev",50000,"hyd"));
		list.add(new modelClass("Deepa","dev",50000,"hyd"));
		list.add( new modelClass("harsha","dev",50000,"hyd"));
		return list;
	}
	
	@GetMapping("/token")
	public CsrfToken gettoken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("-Csrf");
	}
	
	
	@PostMapping("/add")
	public String adddata( @RequestBody  modelClass data) {
		
		list.add(data);
		return "data added Succesfully";
	}

	 
	 
}
