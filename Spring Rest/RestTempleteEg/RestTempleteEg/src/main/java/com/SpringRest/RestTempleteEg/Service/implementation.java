package com.SpringRest.RestTempleteEg.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.SpringRest.RestTempleteEg.weblayer.Coustmerpojo;

@Service
public class implementation implements impleinterface {
	
	private String Uripost="http://localhost:8080/agency/book";
	private String uriget="http://localhost:8080/agency/getdata/{id}";

	@Override
	public Integer bookingtickets(Coustmerpojo pojo) {
   RestTemplate rest=new RestTemplate();
   ResponseEntity<Integer> id=rest.postForEntity(Uripost,pojo,Integer.class);
		return id.getBody();
	}

	@Override
	public Coustmerpojo gettickets(Integer id) {
		// TODO Auto-generated method stub
		RestTemplate rest=new RestTemplate();
		   ResponseEntity<Coustmerpojo> data=rest.getForEntity(uriget,Coustmerpojo.class,id);
				return data.getBody();
		
	}

	
	
}
