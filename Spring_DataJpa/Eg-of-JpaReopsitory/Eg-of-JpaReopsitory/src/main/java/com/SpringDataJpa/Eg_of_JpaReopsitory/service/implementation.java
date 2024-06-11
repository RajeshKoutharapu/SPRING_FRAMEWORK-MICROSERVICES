package com.SpringDataJpa.Eg_of_JpaReopsitory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringDataJpa.Eg_of_JpaReopsitory.persistence.EntityClass;
import com.SpringDataJpa.Eg_of_JpaReopsitory.persistence.Repointerface;
@Component
public class implementation implements jpamethodsinterface {

	
	@Autowired
   Repointerface repo;
	public void getallbyid(Iterable<Integer> ids) {
	    List<EntityClass> res= repo.findAllById(ids);
	    for (EntityClass entityClass : res) {
			System.out.println(entityClass.getName()+" "+entityClass.getId()+" "+entityClass.getPrice());
		}
	}

}
