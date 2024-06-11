package com.SpringDataJpa.Eg_Paging_Sorting_Repo.service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Properties;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.SpringDataJpa.Eg_Paging_Sorting_Repo.persistence.EntityClass;
import com.SpringDataJpa.Eg_Paging_Sorting_Repo.persistence.RepoInterface;
@Component
public class implementation implements implementedfunctions{
	@Autowired
	RepoInterface repo;

	public Iterable<EntityClass> Sortingmethod(boolean order,String... parameters) {
		
		Sort.Direction direction = order ? Sort.Direction.ASC : Sort.Direction.DESC;
		Sort sort = Sort.by(direction, parameters);
		  
	       return  repo.findAll(sort);
	}

	public void pagingmaethod(int pgno,int pgsize) {
		// TODO Auto-generated method stub
		for(int i=0;i<pgno;i++) {
			PageRequest pg=PageRequest.of(i,pgsize);
			  Page<EntityClass> ses=repo.findAll(pg);
			 ses.getContent().forEach(c->System.out.println(c.getName()+" "+c.getId()));
			 System.out.println(ses.getTotalPages());
				
		}
	
	}
	
	
}
