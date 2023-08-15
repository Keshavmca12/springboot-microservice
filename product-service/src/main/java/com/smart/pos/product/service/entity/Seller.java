package com.smart.pos.product.service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class Seller extends BaseEntity {
	
	private String sellerName;

	private String partyId;

	private String description;

}
