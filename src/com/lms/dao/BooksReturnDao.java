package com.lms.dao;

import java.util.List;

import com.lms.beans.BooksReturned;

public interface BooksReturnDao {
	int returnBooks(BooksReturned returned);
	int updateReturnedBookDetails(BooksReturned booksReturned);
	List<BooksReturned> viewReturnedBooksList();
	List<BooksReturned> viewDelayBooksList();
	
}
