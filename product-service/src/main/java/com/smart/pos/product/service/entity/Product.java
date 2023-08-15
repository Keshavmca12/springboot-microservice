package com.smart.pos.product.service.entity;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Product extends BaseEntity {

	
	private String productName;

	private String description;

	private Boolean isActive;
	
	private String categoryId;
	
	private List<String> sellerIds;

}
