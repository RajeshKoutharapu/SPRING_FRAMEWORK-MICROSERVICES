package com.SpringRest.Global_Exception_HandlingEg1.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringRest.Global_Exception_HandlingEg1.model.coustmerpojo;
import com.SpringRest.Global_Exception_HandlingEg1.service.interfaceimpl;

@Component
public class dbOpertaions {
  @Autowired
	Irepointerface repo;
	public Optional<coustmerpojo> findid(Integer id) {
		
		
		return repo.findById(id);
	}
	
	public coustmerpojo updatedestination(Integer uid,String ds){
		
		 repo.updatedesti(ds, uid);
		 return repo.findById(uid).get();
	}
}
