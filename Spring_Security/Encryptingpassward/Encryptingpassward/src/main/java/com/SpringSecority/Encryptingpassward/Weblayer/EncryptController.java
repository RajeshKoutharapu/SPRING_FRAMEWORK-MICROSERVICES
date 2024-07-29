package com.SpringSecority.Encryptingpassward.Weblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecority.Encryptingpassward.Dao.interfaceRepo;
import com.SpringSecority.Encryptingpassward.Dao.users;

@RestController
public class EncryptController {
@Autowired
private	interfaceRepo repo;

	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
	
	@PostMapping("/register")
	public users addpass(@RequestBody users user) {
		   String pass=user.getPass();
		   String encoded=encoder.encode(pass);
		   user.setPass(encoded);
		    return  repo.save(user);
	}
	
}
