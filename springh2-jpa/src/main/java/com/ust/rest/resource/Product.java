package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto is default generation type/strategy(generation type is the strategy which the JPA should use or follow to generate primary key values)
	//When the underlying database is mysql generationType.auto means the jpa will create a hibernate sequence in the database for generation of primary key
	/*
	 * select next_val as id_val from hibernate_sequence for update Hibernate:
	 * update hibernate_sequence set next_val= ? where next_val=? Hibernate: insert
	 * into product (description, price, product_name, qty, product_id) values (?,
	 * ?, ?, ?, ?)
	 * 
	 * GenerationType.IDENTITY : FOR THIS STRATEGY TO WORK first we have to create a table in mysql database and explicitly specify Auto increment(AI) column as checked for primary key column
	 * and in application.properties file  spring.jpa.hibernate.ddl-auto=update this should not be set .If it is set it should have value as update
	 */
	private long productid;
	private String name;
	private String description;
	private BigDecimal Price;
	private int qty;
	
	public long getProductId() {
		return productid;
	}
	public void setProductId(long productId) {
		this.productid = productId;
	}
	public String getName() {
		return name;
	}
	public void setProductName(String productName) {
		this.name = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		this.Price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	

}
