package com.SpringDataJpa.Satatic_Dynamic_Projection.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringDataJpa.Satatic_Dynamic_Projection.view.View;
import com.SpringDataJpa.Satatic_Dynamic_Projection.view.View1;

public interface Repointerface extends JpaRepository<EntityClass, Integer> {
	public List<View> findByid(Integer id);
	public List<View1> findByprice(Integer price);

}
