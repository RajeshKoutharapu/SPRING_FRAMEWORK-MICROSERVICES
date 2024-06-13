package com.SpringRest.GlobalException_Handling.Dao;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.SpringRest.GlobalException_Handling.Pojos.coustmorpojo;

@Controller
public class Dboperations {
	@Autowired
	Irepointerface repo;

	public Integer insertdata(coustmorpojo pojo) {
		coustmorpojo obj=repo.save(pojo);
		return obj.getId();
	}
	
	public  Optional<coustmorpojo> getdatabyid(Integer id) {
		
		 return repo.findById(id);   
        
         
	}
}
