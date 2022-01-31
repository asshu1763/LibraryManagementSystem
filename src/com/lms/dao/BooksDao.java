package com.lms.dao;

import java.util.*;

import com.lms.beans.Books;

public interface BooksDao {
	int  addBook(Books  book);
	int updateBookDetails(Books book);
	int removeBook(int bookid);
	List<Books> searchBookByTitle(String keyword);
	List<Books> searchBookBySubject(String keyword);
	List<Books> viewAllBooks();
}
