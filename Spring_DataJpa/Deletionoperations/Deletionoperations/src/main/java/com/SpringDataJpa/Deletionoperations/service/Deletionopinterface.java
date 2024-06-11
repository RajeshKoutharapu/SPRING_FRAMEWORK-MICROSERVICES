package com.SpringDataJpa.Deletionoperations.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.SpringDataJpa.Deletionoperations.persistence.TableClass;

@Component
public interface Deletionopinterface {

	public void DeleteAllById(List<Integer> idlist);
	public void DeleteByid(Integer id);
	public void DeleteByEntity(TableClass entity);
}
