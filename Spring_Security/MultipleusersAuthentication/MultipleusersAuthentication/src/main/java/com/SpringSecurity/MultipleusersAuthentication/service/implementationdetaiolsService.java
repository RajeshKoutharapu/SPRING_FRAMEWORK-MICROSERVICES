package com.SpringSecurity.MultipleusersAuthentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringSecurity.MultipleusersAuthentication.Dao.repointerface;
import com.SpringSecurity.MultipleusersAuthentication.Dao.users;

@Service
public class implementationdetaiolsService implements UserDetailsService{
	@Autowired
	repointerface repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		 users user= repo.findByName(username);
		  
		  if(user==null) {
			  System.out.println("404 not found error");
			  throw new UsernameNotFoundException("User id not found");
		  }
		  
		return new UserPrinciple(user);
	}

}
