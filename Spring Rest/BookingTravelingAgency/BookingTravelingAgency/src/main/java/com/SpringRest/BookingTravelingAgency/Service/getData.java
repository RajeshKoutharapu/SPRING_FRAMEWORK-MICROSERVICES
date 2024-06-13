package com.SpringRest.BookingTravelingAgency.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.BookingTravelingAgency.Dao.dboperations;
import com.SpringRest.BookingTravelingAgency.model.Coustmerpojo;

@Service
public class getData {
	@Autowired
   dboperations obj;
      public Coustmerpojo getdata(Integer id) { 
    	  
    	  
    	   return   obj.getdatabyid(id);
      }
	
}
