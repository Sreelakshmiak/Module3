package com.ust.rest.resource;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor    
public class Product {

	public Product(int i, String string, String string2, BigDecimal bigDecimal, int j) {
		// TODO Auto-generated constructor stub
	}
	//soap is always try to give extension to the existing methods..
	//rest is diffrent representation to the resource
	@Getter
	@Setter
	
	private long productId;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String description;
	@Getter
	@Setter
  private BigDecimal price;
	@Getter
	@Setter
  private int qty;
	public long getProductId() {
		// TODO Auto-generated method stub
		return 0;
	}
  
//public long getProductId() {
//	return productId;
//}
//public void setProductId(long productId) {
//	this.productId = productId;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public String getDescription() {
//	return description;
//}
//public void setDescription(String description) {
//	this.description = description;
//}
//public BigDecimal getPrice() {
//	return price;
//}
//public void setPrice(BigDecimal price) {
//	this.price = price;
//}
//public int getQty() {
//	return qty;
//}
//public void setQty(int qty) {
//	this.qty = qty;
//}
//  
//  
//  
  
  
}

