package com.SpringSecurity.MultipleusersAuthentication.weblayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	List<students> list=new ArrayList<>();
	public MainController() {
	list.add(new students(1,"rah","java"));
	list.add(new students(1,"rah","java"));
	list.add(new students(1,"rah","java"));
	}
	
@PostMapping("/set")
	public String setdata(students stu) {
		
		list.add(stu);
		return "student data added";
	}
	@GetMapping("/get")
	public List<students> getdata() {
		return list;
	}
}
