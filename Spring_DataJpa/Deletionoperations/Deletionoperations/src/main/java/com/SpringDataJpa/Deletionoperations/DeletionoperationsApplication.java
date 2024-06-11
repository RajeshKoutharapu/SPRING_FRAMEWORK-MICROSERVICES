package com.SpringDataJpa.Deletionoperations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.Deletionoperations.persistence.TableClass;
import com.SpringDataJpa.Deletionoperations.service.Deletionoperations;

@SpringBootApplication
public class DeletionoperationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(DeletionoperationsApplication.class, args);
		      Deletionoperations obj=container.getBean(Deletionoperations.class);
		      obj.DeleteByid(1);
		      List<Integer> idlist=new ArrayList<>();
		      idlist.add(2);
		      idlist.add(3);
		      obj.DeleteAllById(idlist);
		      TableClass tableclass=new TableClass(5,"coldtb",80,"100mg");
		      obj.DeleteByEntity(tableclass); 
		      
		      
	}

}
