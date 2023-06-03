package com.example.rabbitmq.model;

public class Order {
	private String orderid;
	private String name;
	private String qty;
	private String price;
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
}
