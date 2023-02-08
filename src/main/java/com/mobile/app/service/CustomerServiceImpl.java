package com.mobile.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.app.entity.Customer;
import com.mobile.app.exception.CustomerException;
import com.mobile.app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCutomer(Customer newCustomer) {

		return customerRepository.save(newCustomer);
	}

	@Override
	public Customer getCutomerById(Integer customerId) throws CustomerException {

		Optional<Customer> optCustomer = customerRepository.findById(customerId);
		if (optCustomer.isEmpty())
			throw new CustomerException("Cusomer id not found :" + customerId);

		return optCustomer.get();
	}

	@Override
	public Customer updateCutomer(Customer updateCustomer) {

		return this.customerRepository.save(updateCustomer);
	}

	@Override
	public Customer deleteCutomerById(Integer customerId) throws CustomerException {

		Optional<Customer> optCustomer = this.customerRepository.findById(customerId);
		if (optCustomer.isEmpty())
			throw new CustomerException("Customer id does not exists to delete !");
		Customer customer = optCustomer.get();
		this.customerRepository.delete(customer);
		return customer;
	}

}
