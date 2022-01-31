package com.lms.dao;

import java.util.List;

import com.lms.beans.Feedback;

public interface FeedbackDao {
	int writeFeedbank(int userid);
	int updateFeedback(Feedback feedback);
	List<Feedback> viewFeedbackList();
	Feedback viewFeedBackByUser(int userid);
	
}
