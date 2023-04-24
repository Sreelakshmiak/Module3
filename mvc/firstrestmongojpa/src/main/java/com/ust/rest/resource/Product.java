package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	//soap is always try to give extension to the existing methods..
	//rest is diffrent representation to the resource

	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Auto is the default generation type or statergy jpa to follow primary key values,
	//strategy not specify the jpa uses auto specifies, the underline database is mysql the
	// generation type auto means the jpa will create a hybernate sequence in database for generation of primary key.
	@Id
	private String _id;
	//private long productId;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
  
  
//  
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
  
  
  
  
}

