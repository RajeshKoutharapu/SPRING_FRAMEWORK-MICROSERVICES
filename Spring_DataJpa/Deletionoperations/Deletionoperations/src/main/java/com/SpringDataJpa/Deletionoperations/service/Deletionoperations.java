package com.SpringDataJpa.Deletionoperations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJpa.Deletionoperations.persistence.Repositoryinterface;
import com.SpringDataJpa.Deletionoperations.persistence.TableClass;

import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder.In;

@Service
public class Deletionoperations implements Deletionopinterface{
	@Autowired
	private Repositoryinterface Repo;

	@Override
	public void DeleteByid(Integer id) {
		Optional<TableClass> entity=Repo.findById(id);
		if(entity!=null) {
			Repo.deleteById(id);
			System.out.println(id+"record deleted");}
		else
			System.out.println("ni record found");
		}

	@Override
	public void DeleteAllById(List<Integer> idlist) {
		Iterable<Integer>Idlist=(Iterable<Integer>)idlist;
		 List<TableClass> datalist=(List)Repo.findAllById(Idlist);
		 if(idlist.size()==datalist.size()) {
			 Repo.deleteAllById(Idlist);
			 System.out.println("data records are deleted ");
		 }else
			 System.out.println("unable to find all id");
		    }

	@Override
	public void DeleteByEntity(TableClass entity) {
		    Optional<TableClass> opres=Repo.findById(entity.getId());
		    if(opres==null) {
		    	System.out.println("in valid entity details");
		    }
		    else {
		    	Repo.delete(entity);
		    	System.out.println("enntity deleted ");
		    }
		
	}
	
	

}
