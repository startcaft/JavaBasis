package com.startcaft.spring.transaction.xml.service;

import java.util.List;

public interface Cashier {
	
	void checkout(String username,List<String> isbns);
}
