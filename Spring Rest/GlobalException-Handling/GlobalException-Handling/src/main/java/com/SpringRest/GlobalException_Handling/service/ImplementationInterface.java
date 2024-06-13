package com.SpringRest.GlobalException_Handling.service;

import org.springframework.stereotype.Component;

import com.SpringRest.GlobalException_Handling.Pojos.coustmorpojo;

@Component
public interface ImplementationInterface {
	
	public String Insertdata(coustmorpojo cmp);
	public coustmorpojo getdatabyid(Integer id);

}
