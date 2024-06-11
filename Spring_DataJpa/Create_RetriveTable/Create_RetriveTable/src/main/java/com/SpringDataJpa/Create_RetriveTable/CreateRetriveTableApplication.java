package com.SpringDataJpa.Create_RetriveTable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringDataJpa.Create_RetriveTable.persistence.TableClass;
import com.SpringDataJpa.Create_RetriveTable.service.Servicelogic;

@SpringBootApplication
public class CreateRetriveTableApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(CreateRetriveTableApplication.class, args);
		Servicelogic bean=container.getBean(Servicelogic.class);
		
//             --> for single record insertion
		
//		TableClass obj=new TableClass(1,"dolo",20,"10mg");
//		    boolean res=bean.Createtable(obj);    
//		   System.out.println("is values inserted?"+res);
		
		
		
		
		
//          ----------->for multiple records insertion
		
//		TableClass obj1=new TableClass(2,"vitc",20,"10mg");
//		TableClass obj2=new TableClass(3,"vitd",200,"10mg");
//		TableClass obj3=new TableClass(4,"citrezen",50,"180mg");
//		TableClass obj4=new TableClass(5,"coldtb",80,"100mg");
//		TableClass obj5=new TableClass(6,"zinctb",90,"109mg");
//		List<TableClass> list=new ArrayList<>();
//		list.add(obj1);
//		list.add(obj2);                           
//		list.add(obj3);
//		list.add(obj4);
//		list.add(obj5);
//		boolean res=bean.addentities(list);
//		System.out.println("is values inserted?"+res);
		
		
		
//       		--->retriving records
//		
		List<TableClass> list=bean.Retrivrdata();
		for (TableClass tableClass : list) {
			System.out.println(tableClass.getId()+" "+tableClass.getName()+" "+tableClass.getPrice()+" "+tableClass.getWeight());
		}
		
		
	}

}
