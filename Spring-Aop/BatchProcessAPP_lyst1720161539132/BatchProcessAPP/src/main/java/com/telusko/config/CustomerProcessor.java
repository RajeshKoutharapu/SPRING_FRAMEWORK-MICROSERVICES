package com.telusko.config;

import org.springframework.batch.item.ItemProcessor;

import com.telusko.dao.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer>
{

	@Override
	public Customer process(Customer item) throws Exception {
	
		//logic to process data or filter or perform oprn .....
		
		return item;
	}
	

}
