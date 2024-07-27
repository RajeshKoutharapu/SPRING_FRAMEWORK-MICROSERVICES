package com.SpringSecurity.MulUserswithDataBase.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.SpringSecurity.MulUserswithDataBase.Dao.Dboperations;
import com.SpringSecurity.MulUserswithDataBase.Dao.user;

public class userPrinciple implements UserDetails{
	@Autowired
	user user;
	
	public userPrinciple(user user) {
		this.user=user;
	}
//	@Autowired
//	Dboperations dbop;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPass();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getName();
	}

}
