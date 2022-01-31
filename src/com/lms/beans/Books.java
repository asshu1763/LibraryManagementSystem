package com.lms.beans;

public class Books {
	private int bookId;
	private String title;
	private String subject;
	private String author;
	private String publisher;
	private int published_year;
	private String isbn_code;
	private int quantity;
	private String shelf_details;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublished_year() {
		return published_year;
	}
	public void setPublished_year(int published_year) {
		this.published_year = published_year;
	}
	public String getIsbn_code() {
		return isbn_code;
	}
	public void setIsbn_code(String isbn_code) {
		this.isbn_code = isbn_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getShelf_details() {
		return shelf_details;
	}
	public void setShelf_details(String shelf_details) {
		this.shelf_details = shelf_details;
	}
}
