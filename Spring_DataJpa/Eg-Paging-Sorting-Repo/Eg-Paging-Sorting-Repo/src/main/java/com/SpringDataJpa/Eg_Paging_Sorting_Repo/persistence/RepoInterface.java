package com.SpringDataJpa.Eg_Paging_Sorting_Repo.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepoInterface extends PagingAndSortingRepository<EntityClass, Integer> {

}
