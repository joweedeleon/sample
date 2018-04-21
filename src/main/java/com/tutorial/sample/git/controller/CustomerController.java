package com.tutorial.sample.git.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.sample.git.model.Customer;

@RestController
public class CustomerController {
	
	ArrayList <Customer> customerList = new ArrayList<Customer>();
	
	@GetMapping("/customers")
	public List<Customer> customers(){
		setupData();
		return customerList;
				
	}
	
	private void setupData() {
		
		Customer customer = new Customer();
		customer.setFirstName("Jowee");
		customer.setLastName("De Leon");
		customer.setUserName("jdeleon");
		
		customerList.add(customer);
		
		customer = new Customer();
		customer.setFirstName("Stephanie");
		customer.setLastName("De Leon");
		customer.setUserName("sdeleon");
		
		
		
	}

}
