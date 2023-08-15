package com.smart.pos.product.service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductSKU extends BaseEntity {

	
	private String name;

	private String type;
	
	private String productId;
	
}
