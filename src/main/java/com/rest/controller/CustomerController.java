package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Customer;
import com.rest.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	
	@Autowired CustomerRepository customerRepository;
	
	@RequestMapping("/test")
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
}
