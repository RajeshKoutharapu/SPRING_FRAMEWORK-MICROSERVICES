package com.SpringDataJpa.Satatic_Dynamic_Projection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringDataJpa.Satatic_Dynamic_Projection.dao.Repointerface;
@Component
public class implementation implements implementationinterface{

	@Autowired
	Repointerface repo;
	@Override
	public void StaticprojectionByid(Integer id) {
		// TODO Auto-generated method stub
		repo.findByid(id).forEach(v->System.out.println(v.getName()+"-->"+v.getPrice()));}
	@Override
	public void DynamicProjectionByprice(Integer price) {
		// TODO Auto-generated method stub
		repo.findByprice(price).forEach(v->System.out.println(v.getName()+"-->"+v.getWeight()));
		
	}


}
