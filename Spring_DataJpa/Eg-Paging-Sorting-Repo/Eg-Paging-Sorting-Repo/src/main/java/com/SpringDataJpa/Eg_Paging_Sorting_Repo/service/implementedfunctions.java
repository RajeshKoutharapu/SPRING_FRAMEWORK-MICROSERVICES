package com.SpringDataJpa.Eg_Paging_Sorting_Repo.service;

import com.SpringDataJpa.Eg_Paging_Sorting_Repo.persistence.EntityClass;

public interface implementedfunctions {

public Iterable<EntityClass> Sortingmethod(boolean order,String... parameters);
public void pagingmaethod( int pgno,int pfsize );
	
}
