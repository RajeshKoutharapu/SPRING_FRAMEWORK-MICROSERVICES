package com.SpringSecurity.MultipleusersAuthentication.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repointerface extends JpaRepository<users, Integer> {
	public users findByName(String name);

}
