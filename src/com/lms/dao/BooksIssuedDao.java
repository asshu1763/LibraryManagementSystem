package com.lms.dao;

import java.util.List;

import com.lms.beans.BooksIssued;

public interface BooksIssuedDao {
	int addIssuedBook(BooksIssued issued);
	int updateIssuedBook(BooksIssued issued);
	int deleteIssuedBook(BooksIssued issued);
	List<BooksIssued> viewBooksIssuedList();
	
}
