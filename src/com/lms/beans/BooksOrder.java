package com.lms.beans;

import java.util.Date;

public class BooksOrder {
	private int orderId;
	private Books books;
	private Publishers publishers;
	private int quantity;
	private Date orderDate;
	private String orderStatus;

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	public Publishers getPublishers() {
		return publishers;
	}
	public void setPublishers(Publishers publishers) {
		this.publishers = publishers;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
}
