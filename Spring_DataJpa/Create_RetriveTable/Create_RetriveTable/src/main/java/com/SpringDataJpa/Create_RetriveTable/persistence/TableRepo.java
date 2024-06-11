package com.SpringDataJpa.Create_RetriveTable.persistence;

import org.springframework.data.repository.CrudRepository;

public interface TableRepo extends CrudRepository<TableClass, Integer> {
	

}
