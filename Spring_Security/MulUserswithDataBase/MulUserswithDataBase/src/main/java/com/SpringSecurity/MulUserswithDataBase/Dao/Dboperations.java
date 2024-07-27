package com.SpringSecurity.MulUserswithDataBase.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dboperations {
	       @Autowired
          repointerface repo;
          
    public user findbyname(String username) {
    	
    	return repo.findByName(username);
    }
}
