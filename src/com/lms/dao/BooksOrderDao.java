package com.lms.dao;

import java.util.List;

import com.lms.beans.Books;
import com.lms.beans.BooksOrder;

public interface BooksOrderDao {
	int placeBooksOrder(Books book);
	int cancelOrder(int orderId);
	int updateOrder(BooksOrder order);
	List<BooksOrder> viewOrdersList();
	BooksOrder viewOrderById(int orderId);
}
