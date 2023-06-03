package com.example.feignclient.model;

import java.math.BigDecimal;





public class Product {
	
	 // Auto is default generation type/strategy(generation type is the strategy which the JPA should use or follow to generate primary key values)
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
	Integer productId;
	  String name;
	  String category;
	  String brand;
	  double price;
	  public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String name, String category, String brand, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
