package com.SpringSecurity.JwtTokengen.Passing.webLayer;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecurity.JwtTokengen.Passing.Dao.RepoInteface;
import com.SpringSecurity.JwtTokengen.Passing.Dao.user;
import com.SpringSecurity.JwtTokengen.Passing.Service.JwtService;

@RestController
public class AuthenCationJWTController {
	@Autowired
	RepoInteface repo;

	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtService jwtService;
	@PostMapping("/register")
	public user register(@RequestBody user user) {
		user.setPass(encoder.encode(user.getPass()));
		System.out.println(user.getPass());
		   return repo.save(user);
		}
	
	@PostMapping("/login")
	public String login(@RequestBody user user)
	{
	    //System.out.println("Its login not registration");
	  org.springframework.security.core.Authentication authentication= authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getName(), user.getPass()));
		
		if(authentication.isAuthenticated())
		{
			return jwtService.generateToken(user.getName());
			
		}
		else
		{
			return "Login failed";
		}
	
		
	}
	
	
}
