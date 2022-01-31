package com.lms.dao;

import java.util.List;

import com.lms.beans.Books;
import com.lms.beans.DamagedBooks;

public interface DamagedBooksDao {
	int addDamagedBooks(Books bookid);
	int updateDamagedBookDetails();
	List<DamagedBooks> viewDamagedBooksList();
	DamagedBooks viewDamagedBookById(int id);
}
