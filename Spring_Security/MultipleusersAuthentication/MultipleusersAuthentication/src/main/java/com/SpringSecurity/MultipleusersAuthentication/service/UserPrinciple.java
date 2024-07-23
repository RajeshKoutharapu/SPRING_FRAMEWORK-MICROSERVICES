package com.SpringSecurity.MultipleusersAuthentication.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.SpringSecurity.MultipleusersAuthentication.Dao.users;

public class UserPrinciple implements UserDetails {
	
private users user;
public UserPrinciple(users user) {
	this .user=user;
}

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
