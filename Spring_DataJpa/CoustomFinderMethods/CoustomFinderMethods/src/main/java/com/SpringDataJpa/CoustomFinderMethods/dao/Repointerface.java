package com.SpringDataJpa.CoustomFinderMethods.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repointerface extends JpaRepository<EntityClass, Integer> {
	public List<EntityClass> findByprice(Integer price);
	public List<EntityClass> findBypriceBetween(Integer stprice,Integer  endprice);
	public List<EntityClass> findByPriceAndName(Integer price,String name);
	

}
