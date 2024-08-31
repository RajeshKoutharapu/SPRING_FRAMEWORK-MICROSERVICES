package com.SpringSecurity.JwtTokengen.Passing.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringSecurity.JwtTokengen.Passing.Dao.RepoInteface;
import com.SpringSecurity.JwtTokengen.Passing.Dao.user;

@Service
public class MyUserDetailsService implements  UserDetailsService  {

	@Autowired
	RepoInteface repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// TODO Auto-generated method stub
		user data=repo.findByName(username);
		if(data==null)
		{
			System.out.println("404 error");
			throw new UsernameNotFoundException("User name Not found BROOOOOO");
		}
		System.out.println("above");
		return new  UserPrinciple(data);
	}

}
