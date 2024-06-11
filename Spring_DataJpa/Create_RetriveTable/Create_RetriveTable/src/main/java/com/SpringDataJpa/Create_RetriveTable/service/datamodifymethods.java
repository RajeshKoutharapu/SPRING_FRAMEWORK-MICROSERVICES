package com.SpringDataJpa.Create_RetriveTable.service;

import java.util.List;

import com.SpringDataJpa.Create_RetriveTable.persistence.TableClass;

public interface datamodifymethods {
public boolean Createtable(TableClass entity);
public boolean addentities(List<TableClass> entitylist);
public List<TableClass> Retrivrdata();
}
