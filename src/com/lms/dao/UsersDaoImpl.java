package com.lms.dao;

import com.lms.beans.Users;

public class UsersDaoImpl implements UsersDao {

	@Override
	public int register(Users user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Users loginValidate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelSubscription(int userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int payThePenality(int userid, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserDetails(Users user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
