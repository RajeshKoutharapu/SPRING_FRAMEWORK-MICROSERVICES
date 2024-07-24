package com.SpringSecurity.EncryptingPassword.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repoInterface extends JpaRepository<users, Integer> {

	public users findByName(String username);
}
