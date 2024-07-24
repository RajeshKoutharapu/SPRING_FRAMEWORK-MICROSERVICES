package com.SpringAop.SpringAopEg.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringAop.SpringAopEg.Dao.Dboperations;
import com.SpringAop.SpringAopEg.model.laptop;

@Service
public class implementation {
	@Autowired
	Dboperations dbop;
       public laptop register(laptop lap) throws Exception {
    	   
    	   if(!lap.getBrand().equals("HP"))
    		    throw new Exception("I CORRECT BRAND IT NOT GOOD ONE");
    	   return dbop.savedat(lap);
       }
       public List<laptop> fetchdata(){
               return dbop.getallData();    	   
       }
}
