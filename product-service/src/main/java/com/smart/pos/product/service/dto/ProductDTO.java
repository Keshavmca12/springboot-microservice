package com.smart.pos.product.service.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ProductDTO extends BaseDTO {

	
	private String productName;

	private String description;

	private String categoryId;
	
	private List<String> sellerIds;

}
