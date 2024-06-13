package com.SpringRest.GlobalException_Handling.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.GlobalException_Handling.Dao.Dboperations;
import com.SpringRest.GlobalException_Handling.ExceptionHandling.IdnotFoundException;
import com.SpringRest.GlobalException_Handling.Pojos.coustmorpojo;

@Service
public class Implementation implements ImplementationInterface{

	@Autowired
	Dboperations dbop;
	@Override
	public String Insertdata(coustmorpojo cmp) {
		Integer id=dbop.insertdata(cmp);
	
		return "Data inserted Succesfully for id :"+id;
		
	}

	@Override
	public coustmorpojo getdatabyid(Integer id) {
		
		Optional<coustmorpojo>  data=dbop.getdatabyid(id);
		//return data.get();
		if(data.isPresent()) {
       	 return data.get();
       }else {
    		throw new IdnotFoundException("Id not Found");
       }
	}
	    
	
}



