package com.smart.pos.orderservice.dto;

import java.math.BigDecimal;

public class OrderItemDTO {

private Integer orderItemId;
	
	//Party Id of application that created the user
	private Integer createdBy;
	
	private Integer orderId;
	
	private Integer shippingOrderId;
	
	private String orderNumber;
	
	private Integer offerId;
	
	private Integer productId;
	
	private Integer quantity;
	
	private BigDecimal sellingPrice;
	
	private BigDecimal unitPrice;
	
}
