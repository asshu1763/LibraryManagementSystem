package com.lms.dao;

import java.util.List;

import com.lms.beans.Author;

public interface AuthorDao {
	int addAuthorDetails(Author author);
	int updateAuthorDetails(Author author);
	int deleteAuthorDetails(int authorid);
	List<Author> viewAuthorList();
	Author viewAuthorByid(int id);
	
}
