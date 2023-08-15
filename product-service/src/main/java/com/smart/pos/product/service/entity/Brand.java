package com.smart.pos.product.service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Brand extends BaseEntity{
	
	private String brandType;

	private String brandName;

	private String description;

}
