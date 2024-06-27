package com.SpringRest.WebClient_eg.service;

import org.springframework.http.ResponseEntity;
import com.SpringRest.WebClient_eg.weblayer.Coustmerpojo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class implementation implements impleinterface {
	
	private String Uripost="http://localhost:8080/agency/book";
	private String uriget="http://localhost:8080/agency/getdata/{id}";

	@Override
	public Integer bookingtickets(Coustmerpojo pojo) {
//   RestTemplate rest=new RestTemplate();
//   ResponseEntity<Integer> id=rest.postForEntity(Uripost,pojo,Integer.class);
//	return id.getBody();
		
		WebClient web=WebClient.create();
		Integer id=web.post().uri(Uripost).retrieve().bodyToMono(Integer.class).block();
		return id;
	}

	@Override
	public Coustmerpojo gettickets(Integer id) {
		// TODO Auto-generated method stub
//		RestTemplate rest=new RestTemplate();
//		   ResponseEntity<Coustmerpojo> data=rest.getForEntity(uriget,Coustmerpojo.class,id);
//				return data.getBody();
		WebClient web=WebClient.create();
		Coustmerpojo pojo=web.get().uri(uriget).retrieve().bodyToMono(Coustmerpojo.class).block();
		return pojo;
		
	}

	
	
}
