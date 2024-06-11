package com.SpringDataJpa.customQuery_eg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringDataJpa.customQuery_eg.dao.Repointerface;

@Component
public class implementation implements implementationinterface {
	@Autowired
	Repointerface repo;

	@Override
	public void getdetailsbyPrice(Integer p1, Integer p2) {
		// TODO Auto-generated method stub
		repo.priceRangeMethod(p1, p2).forEach(s->System.out.println(s));
	}

	@Override
	public void getitemlistonExisted(String existed) {
		// TODO Auto-generated method stub
		List<String> list=repo.itemListOnExisted(existed);
//		     for(int i=0;i<list.size();i++) {
//		System.out.println("itemname -->"+list.get(i));
//		     }
		for (String string : list) {
			
			System.out.println("itemname -->"+string);
		}
			
	}

	@Override
	public void updateitemlist(String status,String itemname) {
		// TODO Auto-generated method stub
		int res=repo.updateitem(status,itemname);
		System.out.println("no.of items updated -->"+res);
	}

}
