package com.SpringRest.GlobalException_Handling.weblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.GlobalException_Handling.Pojos.coustmorpojo;
import com.SpringRest.GlobalException_Handling.service.Implementation;

@RestController
@RequestMapping("/bookingagency")
public class Controllerclass {
	@Autowired
	Implementation impl;

	@PostMapping("/insert")
	public ResponseEntity<String> insertdata(@RequestBody coustmorpojo pojo){
		String ms=impl.Insertdata(pojo);
		return new ResponseEntity<String>(ms,HttpStatus.OK);
		
	}
	
	@GetMapping("/data")
	public ResponseEntity<coustmorpojo> getbyid( @RequestParam("id") Integer Id){
	
		coustmorpojo data=impl.getdatabyid(Id);
		return new ResponseEntity<coustmorpojo>(data,HttpStatus.OK);
	}
}
