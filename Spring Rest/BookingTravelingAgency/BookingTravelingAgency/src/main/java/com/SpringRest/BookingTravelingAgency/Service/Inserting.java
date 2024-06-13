package com.SpringRest.BookingTravelingAgency.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.BookingTravelingAgency.Dao.dboperations;
import com.SpringRest.BookingTravelingAgency.model.Coustmerpojo;

@Service
public class Inserting {
	
    @Autowired
	dboperations obj;
	
	public Integer insertdetails(Coustmerpojo pojo) {
		Integer id=obj.insertdata(pojo);
		return id;
	}
}
