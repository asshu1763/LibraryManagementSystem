package com.lms.beans;

import java.util.Date;

public class Users {
	private int userId;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileno;
	private String email;
	private Date date_of_birth;
	private Date subscription_date;
	private Date sub_expire_date;
	private String subscription_status;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Date getSubscription_date() {
		return subscription_date;
	}
	public void setSubscription_date(Date subscription_date) {
		this.subscription_date = subscription_date;
	}
	public Date getSub_expire_date() {
		return sub_expire_date;
	}
	public void setSub_expire_date(Date sub_expire_date) {
		this.sub_expire_date = sub_expire_date;
	}
	public String getSubscription_status() {
		return subscription_status;
	}
	public void setSubscription_status(String subscription_status) {
		this.subscription_status = subscription_status;
	}
}
