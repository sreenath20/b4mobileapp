package com.mobile.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mobile.app.entity.Customer;
import com.mobile.app.exception.CustomerException;
import com.mobile.app.service.CustomerService;

@SpringBootTest
class CustomerServiceTests {

	
//	Customer addCutomer(Customer newCustomer);
//
//	Customer getCutomerById(Integer customerId) throws CustomerException;
//
//	Customer updateCutomer(Customer updateCustomer);
//
//	Customer deleteCutomerById(Integer customerId)throws CustomerException;

	@Autowired
	private CustomerService customerService;
	
	@Test
	void addCutomerTest() {
		assertNotNull(customerService.addCutomer(new Customer(100, "test name 100", "test100@gmail.com", "test@100")));
	}

	@Test
	void getCutomerByIdTest() throws CustomerException {
		assertNotNull(customerService.getCutomerById(100));
	}
	@Test
	void getCutomerByIdExceptionTest() {
		
		assertThrows(CustomerException.class,()->customerService.getCutomerById(500));
	}
	@Test
	void getCutomerByIdExceptionMessageTest() {
		
		String msg=null;
		try {
			customerService.getCutomerById(500);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			msg=e.getMessage();
		}
		
		assertEquals("Cusomer id not found :500", msg);
	}
	
}
