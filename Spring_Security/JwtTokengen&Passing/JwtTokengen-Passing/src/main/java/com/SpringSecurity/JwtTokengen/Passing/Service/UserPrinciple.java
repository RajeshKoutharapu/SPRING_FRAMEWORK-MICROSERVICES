package com.SpringSecurity.JwtTokengen.Passing.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.SpringSecurity.JwtTokengen.Passing.Dao.user;

//@Service
public class UserPrinciple implements UserDetails  {
	
	//@Autowired
	private user data;
//	public UserPrinciple() {
//		
//	}
	public UserPrinciple(user data) {
		super();
		this.data=data;
		System.out.println("above1");
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return  null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		System.out.println("above11");
		return data.getPass();
		
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return data.getName();
	}

}
