package com.smart.pos.orderservice.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.Getter;

@Data
public class OrderDTO {

	private Integer userId;
	
	//Party Id of application that created the user
	private Integer createdBy;
	
	private Integer orderId;
	
	private Integer shippingOrderId;
	
	private String orderNumber;
	
	/**
	 * TODO create enum for this
	 */
	private String stauts;
	
	/**
	 * Replace with price detail object
	 */
	private BigDecimal total;
	
	private List<OrderItemDTO> items;
}
