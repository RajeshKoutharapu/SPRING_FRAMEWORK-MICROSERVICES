package com.SpringDataJpa.Eg_Paging_Sorting_Repo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.Eg_Paging_Sorting_Repo.persistence.EntityClass;
import com.SpringDataJpa.Eg_Paging_Sorting_Repo.service.implementation;
import com.SpringDataJpa.Eg_Paging_Sorting_Repo.service.implementedfunctions;

@SpringBootApplication
public class EgPagingSortingRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =SpringApplication.run(EgPagingSortingRepoApplication.class, args);
		implementation bean=container.getBean(implementation.class);
		 Iterable<EntityClass> res= bean.Sortingmethod(true,"Price");
		 List<EntityClass> list=(List<EntityClass>)res;
		 for (EntityClass entityClass : list) {
			  System.out.println(entityClass.getId()+" "+entityClass.getName()+" "+entityClass.getWeight()+" "+entityClass.getPrice()+"-------");
		}
		 bean.pagingmaethod(2,1);
	}

}
