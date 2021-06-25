package com.eshopping.order;

import java.time.LocalDateTime;
import com.eshopping.product.Product;

public class Order {
	
	private Product product;
	private LocalDateTime localDateTimeNow;
	private String orderId;
	
	
	public Product getProduct() {
		return product;
	}
	public LocalDateTime getDate() {
		return localDateTimeNow;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setDate(LocalDateTime localDateTimeNow) {
		this.localDateTimeNow = localDateTimeNow;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
	

}
