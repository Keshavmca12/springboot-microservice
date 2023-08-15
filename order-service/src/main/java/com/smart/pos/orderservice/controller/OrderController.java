package com.smart.pos.orderservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.pos.orderservice.dto.OrderDTO;

@RestController
public class OrderController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@PostMapping("createOrder")
	public void createOrder(OrderDTO order) {
		order.getCreatedBy();
	}
	
	@GetMapping("/products")
	public List<String> getProducts() {
		logger.info("Product service : getProducts");
		List<String> products = new ArrayList<String>();
		products.add("Test Product");
		return products;
	}

}
