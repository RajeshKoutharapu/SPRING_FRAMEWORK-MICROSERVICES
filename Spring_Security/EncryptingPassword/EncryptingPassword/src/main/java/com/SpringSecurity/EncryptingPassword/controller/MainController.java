package com.SpringSecurity.EncryptingPassword.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecurity.EncryptingPassword.Dao.repoInterface;
import com.SpringSecurity.EncryptingPassword.Dao.users;
//import com.SpringSecurity.MultipleusersAuthentication.weblayer.students;

@RestController
public class MainController {

	@Autowired
	repoInterface repo;
	
	private BCryptPasswordEncoder encoder =new BCryptPasswordEncoder(12);
	List<students> list=new ArrayList<>();
	public MainController() {
	list.add(new students(1,"rah","java"));
	list.add(new students(1,"rah","java"));
	list.add(new students(1,"rah","java"));
	}
	
	
//	@PostMapping("/register")
//	public users register( @RequestBody users user) {
//		
//		String pass=user.getPass();
//		String encoded=encoder.encode(pass);
//		user.setPass(pass);
//	    return repo.save(user);
//
//	}
	@PostMapping("/reg")
	public users register(@RequestBody users user) {
	//	user.setPass("{noop}" + user.getPass());
		return repo.save(user);
	}
	@GetMapping("/get")
	public List<students> getdata(){
		return list;
	}
	@PostMapping("/set")
	public String addstudent(@RequestBody students stu){
		
		list.add(stu);
		return "Student added sucesfully";
	}
}
