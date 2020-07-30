package com.example.thymeleaf.thymeleafdemo.service;

import java.util.List;

import com.example.thymeleaf.thymeleafdemo.entity.Customer;

public interface CustomerService {

	public List<com.example.thymeleaf.thymeleafdemo.entity.Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(com.example.thymeleaf.thymeleafdemo.entity.Customer theCustomer);
	
	public void deleteById(int theId);
	
}
