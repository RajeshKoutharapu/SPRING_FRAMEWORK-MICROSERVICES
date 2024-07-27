package com.SpringSecurity.MulUserswithDataBase.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface repointerface extends JpaRepository<user, Integer> {
	public user  findByName(String name);

}
