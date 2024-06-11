package com.SpringDataJpa.CoustomFinderMethods.service;

import java.util.List;

import com.SpringDataJpa.CoustomFinderMethods.dao.EntityClass;

public interface implementationinterface {

public void fetchByprice(Integer price);
public void fetchBypriceBetween(Integer stprice ,Integer edprice);
public void fetchBypriceAndname(Integer price,String name);
}
