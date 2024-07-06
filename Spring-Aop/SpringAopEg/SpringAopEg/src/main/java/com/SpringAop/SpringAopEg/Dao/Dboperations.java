package com.SpringAop.SpringAopEg.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringAop.SpringAopEg.model.laptop;
@Component
public class Dboperations {
	@Autowired
	Repositorydao repo;
	public laptop savedat(laptop lap) {
		 return repo.save(lap);
	}
	public List<laptop> getallData(){
		return repo.findAll();
	}

}
