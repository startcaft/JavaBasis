package com.startcaft.spring.hibernate.dao;

public interface BookShopDAO {

	int findBookPriceByIsbn(String isbn);
	
	boolean updateBookStock(String isbn);
	
	boolean updateUserBalace(String username,int price);
}
