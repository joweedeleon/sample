package com.tutorial.sample.git.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.sample.git.model.Order;



@RestController
public class OrderController {
	
	ArrayList orderList = new ArrayList();
	
	@GetMapping ("/order")
	public List<Order> getAllOrders() {
		setupData();
		return orderList;
		
	}
		
	private void setupData() {
		Order order1 = new Order();
		order1.setOrderId("1");
		order1.setOrderType("Food");
		order1.setOrderDesc("Cheeseburger");

		orderList.add(order1);
		
		Order order2 = new Order();
		order2.setOrderId("2");
		order2.setOrderType("Food");
		order2.setOrderDesc("French Friesß");
		
		orderList.add(order2);
		
		
	}

}
