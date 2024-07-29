package com.SpringSecority.Encryptingpassward.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface interfaceRepo extends JpaRepository<users, Integer>   {
	public users findByName(String name);

}