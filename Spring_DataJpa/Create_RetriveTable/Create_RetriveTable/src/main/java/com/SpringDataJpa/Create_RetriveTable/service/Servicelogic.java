package com.SpringDataJpa.Create_RetriveTable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJpa.Create_RetriveTable.persistence.TableClass;
import com.SpringDataJpa.Create_RetriveTable.persistence.TableRepo;

@Service
public class Servicelogic implements datamodifymethods{
	@Autowired
	private TableRepo obj;

	@Override
	public boolean Createtable(TableClass entity) {
		    TableClass res= obj.save(entity);
		   
		    if(res!=null)
	         	return true;
		    else
		    	return false;
	}

	@Override
	public boolean addentities(List<TableClass> entitylist) {
		Iterable<TableClass> res=obj.saveAll(entitylist);
		  if(res==null)
		    return false;
		  else
			  return true;
	}

	@Override
	public List<TableClass> Retrivrdata() {
		return (List<TableClass>) obj.findAll();//type casting iterable to List
		
	}

}
