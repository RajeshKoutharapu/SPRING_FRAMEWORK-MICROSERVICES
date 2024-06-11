package com.SpringDataJpa.customQuery_eg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface Repointerface extends JpaRepository<EntityClass, Integer> {

	@Query("FROM EntityClass WHERE price IN(:p1,:p2)")
	public List<EntityClass> priceRangeMethod(Integer p1,Integer p2);
	
	@Query("SELECT itemname FROM EntityClass WHERE existed=:res")
	public List<String> itemListOnExisted(String res);
	@Transactional
	@Modifying
	@Query("UPDATE EntityClass SET existed=:status WHERE itemname=:foodname")
	public int updateitem(String status,String foodname);
	

}
