package com.SpringRest.Global_Exception_HandlingEg1.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.BindParam;

import com.SpringRest.Global_Exception_HandlingEg1.model.coustmerpojo;

import jakarta.transaction.Transactional;

public interface Irepointerface extends JpaRepository<coustmerpojo, Integer>{
@Transactional	
@Modifying
@Query("UPDATE coustmerpojo SET destination =:ds WHERE id =:uid")	
public  void updatedesti(String ds,Integer uid); 
//@Modifying
@Query("from coustmerpojo WHERE id =:id")
 public coustmerpojo getupdateddata(Integer id);
}
