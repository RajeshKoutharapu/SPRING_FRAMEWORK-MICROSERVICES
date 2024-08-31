package com.SpringSecurity.JwtTokengen.Passing.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoInteface extends JpaRepository<user,Integer> {

	public user findByName(String username);

}
