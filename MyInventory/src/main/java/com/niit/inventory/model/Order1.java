package com.niit.inventory.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order1")
public class Order1 {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long orderId;

private Date orderDate;
private String productName;
private int quantity;
private int price;

@OneToOne
@JoinColumn(name="cust-id")
private Customer customer;

@ManyToOne
@JoinColumn(name="pro-id")
private Product product;

public long getOrderId() {
	return orderId;
}

public void setOrderId(long orderId) {
	this.orderId = orderId;
}

public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}
}
