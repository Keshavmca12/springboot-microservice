package com.smart.pos.product.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.pos.product.service.proxy.controller.InventoryServiceProxy;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private Logger logger =  LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private InventoryServiceProxy inventoryServiceProxy;
	
	
	@GetMapping("/products")
	public List<String> getProductsData() {
		logger.info("Product service : getProducts");
		List<String> products = new ArrayList<String>();
		products.add("Test Product");
		return products;
	}
	
	@GetMapping("/inventory")
	public Integer getInventory() {
		logger.info("Product service : getInventory");
		return inventoryServiceProxy.getInventory();
	}
	

}
