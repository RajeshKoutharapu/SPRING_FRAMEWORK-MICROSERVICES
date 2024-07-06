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
       public laptop register(laptop lap) {
    	   return dbop.savedat(lap);
       }
       public List<laptop> fetchdata(){
               return dbop.getallData();    	   
       }
}
