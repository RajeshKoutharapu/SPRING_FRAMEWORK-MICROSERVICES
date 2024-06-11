package com.SpringDataJpa.CoustomFinderMethods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringDataJpa.CoustomFinderMethods.dao.Repointerface;

@Component
public class implementation implements implementationinterface{

	@Autowired
	 Repointerface repo;
	@Override
	public void fetchByprice(Integer price) {
		// TODO Auto-generated method stub
		repo.findByprice(price).forEach(s->System.out.println(s.getName()+" "+s.getWeight()+" "+s.getPrice()));
	}
	@Override
	public void fetchBypriceBetween(Integer stprice, Integer edprice) {
		// TODO Auto-generated method stub
		repo.findBypriceBetween(stprice, edprice).forEach(v->System.out.println(v.getName()));
		
	}
	@Override
	public void fetchBypriceAndname(Integer price, String name) {
		repo.findByPriceAndName(price,name).forEach(v->System.out.println(v.getName()));
		// TODO Auto-generated method stub
		
	}
	

}
