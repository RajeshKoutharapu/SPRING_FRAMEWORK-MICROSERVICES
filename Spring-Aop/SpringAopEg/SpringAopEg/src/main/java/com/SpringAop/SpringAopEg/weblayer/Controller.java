package com.SpringAop.SpringAopEg.weblayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAop.SpringAopEg.model.laptop;
import com.SpringAop.SpringAopEg.servicelayer.implementation;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	implementation impl;
	@PostMapping("/register")
	public ResponseEntity<laptop> setdetails(@RequestBody laptop lap) throws Exception {
		 laptop lap1 = impl.register(lap);
		    return new ResponseEntity<laptop>(lap1,HttpStatus.CREATED);
	}
	@GetMapping("/getdata")
	public ResponseEntity<List<laptop>> getdata(){
		 List<laptop> list=impl.fetchdata();
		 return new ResponseEntity<List<laptop>>(list,HttpStatus.OK);
	}

}
