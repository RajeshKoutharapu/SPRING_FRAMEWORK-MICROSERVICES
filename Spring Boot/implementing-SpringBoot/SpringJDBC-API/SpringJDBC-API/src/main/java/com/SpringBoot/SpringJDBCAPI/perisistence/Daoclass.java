package com.SpringBoot.SpringJDBCAPI.perisistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("dao")
public class Daoclass implements restorent{
  List<Menu> items=new ArrayList<Menu>();
  final String querry="select * from non_veg_staters";
  @Autowired
  DataSource dataSource;
 public void printitems() {
	  List<Menu> items= getitmes();
	  for (Menu menu : items) {
		  System.out.println(menu.getSno()+" "+menu.getItemname()+" "+menu.getPrice()+" "+menu.getStatus());
		
	}
 }
@Override
public List<Menu> getitmes() {
	
  try {
	Connection con=dataSource.getConnection();
	PreparedStatement pr=con.prepareStatement(querry);
    ResultSet rs=pr.executeQuery();
    while(rs.next()) {
    	Menu menuobj=new Menu();
        menuobj.setSno(rs.getInt(1));
        menuobj.setItemname(rs.getString(2));
        menuobj.setPrice(rs.getInt(3));
        menuobj.setStatus(rs.getString(4));
        items.add(menuobj);
    }
	    
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	return items;
}
	
	
}
