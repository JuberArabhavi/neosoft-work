package com.java.src.controller;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.src.dto.Customer;
import com.java.src.repository.CustomerRepository;

@RestController
@RequestMapping("/api/v2/")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping(value ="getAllCustomers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomers (Optional<Customer> customer) {
		if (!customer.equals(null)) { 
			System.out.println("in customer if condition");
			throw new ResolutionException("Customer record not found");
		} else {
			System.out.println("in else condition");
			return customerRepository.findAll();
		}
	}
	
	public ResponseEntity<Customer> getOneCustomerById (){
		return null;
		
	}
			
}