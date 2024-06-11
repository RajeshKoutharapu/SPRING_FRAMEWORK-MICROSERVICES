package com.SpringMongodb.UsingMongoDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringMongodb.UsingMongoDb.dao.Repointerface;
import com.SpringMongodb.UsingMongoDb.dao.details;
@Component
public class inplemnetation implements implementationinterface {

	
	@Autowired
	Repointerface repo;
	@Override
	public void insertvalues(details data) {
		// TODO Auto-generated method stub
		repo.save(data);
		System.out.println("data inserted");
		
	}
	@Override
	public void getAlldetails() {
		// TODO Auto-generated method stub
		List<details> list=repo.findAll();
		for (details details : list) {
			System.out.println(details.getCity()+" "+details.getVillage()+" "+details.getHno());
		}
		
	}

}
