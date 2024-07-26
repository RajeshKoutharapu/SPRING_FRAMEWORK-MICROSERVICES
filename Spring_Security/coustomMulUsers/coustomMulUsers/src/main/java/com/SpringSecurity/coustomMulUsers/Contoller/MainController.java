package com.SpringSecurity.coustomMulUsers.Contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MainController {
	List<Students> list=new ArrayList<>();
	public MainController() {
		
		list.add(new Students(1,"raj","java"));
		list.add(new Students(2,"vij","c++"));
		
	}
	@GetMapping("/info")
	public String info() {
		return "this ism all about students";
	}
	@PostMapping("/add")
	public String adddata(Students stu) {
		Students s=new Students();
	      s.setId(stu.getId());
	      s.setName(stu.getName());
	      s.setCourse(stu.getCourse());
		 list.add(s);
		 return "Data is added in the list";
	}
	
	@GetMapping("/get")
	public List<Students> getdata(){
		return list;
	}
	@GetMapping("/csrf")
	public CsrfToken gettoken(HttpServletRequest request) {
		System.out.println((CsrfToken) request.getAttribute("_csrf"));
		return (CsrfToken) request.getAttribute("_csrf");
	}
} 
