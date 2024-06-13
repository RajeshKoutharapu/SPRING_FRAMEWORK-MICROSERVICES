package com.SpringRest.BookingTravelingAgency.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringRest.BookingTravelingAgency.model.Coustmerpojo;
@Component
public class dboperations  {
	@Autowired
	Irepointerface repo;
	
	public Integer insertdata(Coustmerpojo pojo) {
		Coustmerpojo p=repo.save(pojo);
		
		return p.getId();
		}
	
	public Coustmerpojo getdatabyid(Integer id) {
		
		    Coustmerpojo data=repo.findByid(id);
		    return data;
		  
	}

}
