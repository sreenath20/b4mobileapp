package com.mobile.app.service;

import com.mobile.app.entity.Customer;
import com.mobile.app.exception.CustomerException;

public interface CustomerService {
	// CRUD
	Customer addCutomer(Customer newCustomer);

	Customer getCutomerById(Integer customerId) throws CustomerException;

	Customer updateCutomer(Customer updateCustomer);

	Customer deleteCutomerById(Integer customerId)throws CustomerException;

}
