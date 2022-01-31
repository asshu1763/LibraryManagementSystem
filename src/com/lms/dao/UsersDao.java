package com.lms.dao;

import com.lms.beans.Users;

public interface UsersDao {
	int register(Users user);
	Users loginValidate(String username, String password);
	void cancelSubscription(int userid);
	int payThePenality(int userid, double amount);
	int updateUserDetails(Users user);
	int deleteUser(int id);
}
