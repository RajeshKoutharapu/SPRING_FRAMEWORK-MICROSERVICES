package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> 
{

}
