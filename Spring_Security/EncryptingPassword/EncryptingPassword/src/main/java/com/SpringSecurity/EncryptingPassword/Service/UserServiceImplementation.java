package com.SpringSecurity.EncryptingPassword.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringSecurity.EncryptingPassword.Dao.repoInterface;
import com.SpringSecurity.EncryptingPassword.Dao.users;
@Service
public class UserServiceImplementation implements UserDetailsService{
      @Autowired
	private repoInterface repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		users user=repo.findByName(username);
		if(user==null) {
			 throw new UsernameNotFoundException("in valid user ");
		}
		
		return	new UserPrinciple(user);
		

	}

}
