package com.SpringRest.Global_Exception_HandlingEg1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.Global_Exception_HandlingEg1.Dao.dbOpertaions;
import com.SpringRest.Global_Exception_HandlingEg1.Exceptions.IidNotFoundException;
import com.SpringRest.Global_Exception_HandlingEg1.model.coustmerpojo;
@Service
public class implementation implements interfaceimpl{
	@Autowired
	dbOpertaions dbop;

	@Override
	public coustmerpojo getdata(Integer id) {
		Optional<coustmerpojo> data=dbop.findid(id);
		if(data.isPresent()) {
			return data.get();
		}else {
			throw new IidNotFoundException("In Valid Id");
		}
		
	}

	@Override
	public coustmerpojo updatedestination(Integer id, String destination) {
		
		Optional<coustmerpojo> data=dbop.findid(id);
		if(data.isPresent()) {
		      return dbop.updatedestination(id, destination);	
		}else {
			throw new IidNotFoundException("In Valid Id");
		}
	}
	

}
