package com.lms.dao;

import java.util.List;

import com.lms.beans.UserAddress;

public interface UserAddressDao {
	int addUserAddress(UserAddress address);
	int updateUserAddress(UserAddress address);
	int deleteUserAddress(int userid);
	UserAddress viewAddressByUserid(int userid);
	List<UserAddress> viewUserAddressList();
}
