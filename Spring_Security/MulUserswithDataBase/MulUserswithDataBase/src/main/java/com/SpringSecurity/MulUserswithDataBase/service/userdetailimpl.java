package com.SpringSecurity.MulUserswithDataBase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringSecurity.MulUserswithDataBase.Dao.Dboperations;
import com.SpringSecurity.MulUserswithDataBase.Dao.user;

@Service
public class userdetailimpl implements UserDetailsService{

	@Autowired
	Dboperations dbop;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		  user data=dbop.findbyname(username);
		  
		  if(data==null)
			  throw new UsernameNotFoundException(" provided user not found");
		// TODO Auto-generated method stub
		return new userPrinciple(data);
	}

	
}
 