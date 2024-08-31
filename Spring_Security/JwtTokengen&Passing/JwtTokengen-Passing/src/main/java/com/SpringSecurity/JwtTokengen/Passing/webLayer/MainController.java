package com.SpringSecurity.JwtTokengen.Passing.webLayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringSecurity.JwtTokengen.Passing.Dao.student;

@Controller
public class MainController {	
List<student> list=new ArrayList<>();

@GetMapping("/info")
public String infm() {
	return "THIS IS ALL ABOUT STUDENTS";
}

@GetMapping("/getdata")
public List<student> getdata(){
	return list;
}
@PostMapping("/add")
public String add(@RequestBody student data) {
	list.add(data);
	return "Datat Added Succesfuly";
}
}
