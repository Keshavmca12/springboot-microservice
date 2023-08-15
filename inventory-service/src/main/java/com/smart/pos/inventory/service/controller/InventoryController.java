package com.smart.pos.inventory.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	
	private Logger logger = LoggerFactory.getLogger(InventoryController.class);

	@GetMapping("/inventory")
	public Integer getInventory() {
		logger.info("inventory service : getInventory");
		return 10;
	}
	
}
