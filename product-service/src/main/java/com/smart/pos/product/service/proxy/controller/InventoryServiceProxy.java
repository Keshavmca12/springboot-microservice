package com.smart.pos.product.service.proxy.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "inventory-service")
public interface InventoryServiceProxy {
	
	@GetMapping("/inventory")
	public Integer getInventory();

}
