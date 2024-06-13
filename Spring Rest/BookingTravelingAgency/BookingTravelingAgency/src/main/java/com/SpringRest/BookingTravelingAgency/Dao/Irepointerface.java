package com.SpringRest.BookingTravelingAgency.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRest.BookingTravelingAgency.model.Coustmerpojo;

public interface Irepointerface extends JpaRepository<Coustmerpojo, Integer> {
	
	public Coustmerpojo findByid(Integer Id);

}
