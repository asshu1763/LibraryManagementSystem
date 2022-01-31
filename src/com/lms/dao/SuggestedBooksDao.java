package com.lms.dao;

import java.util.List;

import com.lms.beans.Books;
import com.lms.beans.SuggestedBooks;

public interface SuggestedBooksDao {
	int suggestBooks(List<Books> bookList);
	int updateSuggestedBookStatus(SuggestedBooks book);
	int deleteSuggetedBooks(int id);
	SuggestedBooks viewSuggetedBookDetails(int id);
	List<SuggestedBooks> viewSuggestedBooksList();
}
