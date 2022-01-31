package com.lms.beans;

import java.util.Date;
import java.util.List;

public class BooksReturned {
	private int id;
	private Users user;
	private List<Books> books;
	private Date returnedDate;
	private int delayed_days;
	private double penality;
	private String penality_status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	public Date getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}
	public int getDelayed_days() {
		return delayed_days;
	}
	public void setDelayed_days(int delayed_days) {
		this.delayed_days = delayed_days;
	}
	public double getPenality() {
		return penality;
	}
	public void setPenality(double penality) {
		this.penality = penality;
	}
	public String getPenality_status() {
		return penality_status;
	}
	public void setPenality_status(String penality_status) {
		this.penality_status = penality_status;
	}
}
