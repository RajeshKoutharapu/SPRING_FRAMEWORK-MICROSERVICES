package com.SpringSecority.Encryptingpassward.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringSecority.Encryptingpassward.Dao.interfaceRepo;
import com.SpringSecority.Encryptingpassward.Dao.users;

@Service
public class userServicecoustom  implements UserDetailsService {
	@Autowired
	interfaceRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		users user=repo.findByName(username);
		if(user==null) {
			throw new UsernameNotFoundException("USER WITH USER NAME DIID NOT FOUND");
		}
		// TODO Auto-generated method stub
		return new userPrinciple(user);
	}

	
	
}
