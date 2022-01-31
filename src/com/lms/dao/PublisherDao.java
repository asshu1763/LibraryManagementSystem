package com.lms.dao;

import java.util.List;

import com.lms.beans.Publishers;

public interface PublisherDao {
	int addPublisher(Publishers publisher);
	int  updatePublisherDetails(Publishers publisher);
	int removePublisher(int publisherId);
	List<Publishers> viewPublishersList();
	Publishers viewPublisherById(int id);
}
