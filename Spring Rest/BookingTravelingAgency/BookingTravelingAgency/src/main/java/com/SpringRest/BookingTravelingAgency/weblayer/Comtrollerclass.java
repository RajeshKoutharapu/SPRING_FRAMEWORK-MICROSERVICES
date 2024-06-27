package com.SpringRest.BookingTravelingAgency.weblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.BookingTravelingAgency.Exceptions.CustomException;
import com.SpringRest.BookingTravelingAgency.Service.Inserting;
import com.SpringRest.BookingTravelingAgency.Service.getData;
import com.SpringRest.BookingTravelingAgency.model.Coustmerpojo;

@RestController
@RequestMapping("/agency")
public class Comtrollerclass {
	@Autowired
	Inserting ins;
	@Autowired
	getData get;
	@PostMapping("/book")
	public ResponseEntity<Integer> Book(@RequestBody Coustmerpojo pojo){
		
		Integer id=ins.insertdetails(pojo);
		return   new ResponseEntity<Integer>(id,HttpStatus.OK);
	}
	
	@GetMapping("/getdata/{id}")
	public ResponseEntity<?> GetData(@PathVariable("id") Integer id){
		try {
			Coustmerpojo pojo=get.getdata(id);
			if(pojo==null)
				  throw new CustomException("INVALID ID");
			return new ResponseEntity<Coustmerpojo>( pojo,HttpStatus.OK);
		
		}catch(CustomException e) {
			System.out.println(e);
			
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}

}
