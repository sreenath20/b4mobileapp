package com.mobile.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.app.entity.Customer;
import com.mobile.app.exception.CustomerException;
import com.mobile.app.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public Customer registerCustomer(@RequestBody Customer newCustomer) {

		return customerService.addCutomer(newCustomer);
	}

	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer customerId) throws CustomerException {

		return customerService.getCutomerById(customerId);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer updateCustomer) {
		
		return customerService.updateCutomer(updateCustomer);
	}
	
	@DeleteMapping("/customer/{id}") // URI templet
	public Customer deleteCustomerById(@PathVariable("id") Integer customerId) throws CustomerException {
		
		return this.customerService.deleteCutomerById(customerId);
		
	}

}
