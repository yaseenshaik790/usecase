package com.hcl.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bank.entity.Customer;
import com.hcl.bank.exception.UserNotFoundExcption;
import com.hcl.bank.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public String customerLogin(String emailId, String password) throws UserNotFoundExcption {

		Optional<Customer> customer = customerRepository.findByCustomerEmailIdAndPassword(emailId, password);

		if (!customer.isPresent()) {
			throw new UserNotFoundExcption("User not found exception");
		}
		
		customer.get().setIsLoggedIn(true);

		customerRepository.save(customer.get());
		
		System.out.println(customer.get().getIsLoggedIn());

		return "login successfull";
	}
}
