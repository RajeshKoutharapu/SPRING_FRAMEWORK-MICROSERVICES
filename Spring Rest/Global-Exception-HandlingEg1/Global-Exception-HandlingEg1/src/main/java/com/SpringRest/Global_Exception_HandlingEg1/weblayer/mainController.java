package com.SpringRest.Global_Exception_HandlingEg1.weblayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.Global_Exception_HandlingEg1.model.coustmerpojo;
import com.SpringRest.Global_Exception_HandlingEg1.service.implementation;


@RestController
@RequestMapping("/api")
public class mainController {
	@Autowired
   implementation impl;
	
	@GetMapping("/getdata/{id}")
	public  ResponseEntity<coustmerpojo> getDataById(@PathVariable("id") Integer id){
		coustmerpojo pojo=impl.getdata(id);
		return new ResponseEntity<coustmerpojo>(pojo,HttpStatus.OK);
	}
	
	@PutMapping("update/{id}/{destination}")
	public ResponseEntity<coustmerpojo> update( @PathVariable("id") Integer id, @PathVariable("destination") String destination){
	coustmerpojo res=impl.updatedestination(id, destination);
		return new ResponseEntity<coustmerpojo>(res,HttpStatus.OK);
	}
}
