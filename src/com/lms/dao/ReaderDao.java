package com.lms.dao;

import java.io.Reader;
import java.util.List;

public interface ReaderDao {
	int register(Reader reader);
	int updateReader(Reader reader);
	int deleteReader(int readerid);
	List<Reader> viewReaderList();
	Reader viewReaderByid(int id);
	Reader loginValidate(String readerid, String password);
}
