package com.nvrs.customer.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nvrs.customer.entity.Customer;
import com.nvrs.customer.service.CustomerService;

@RestController
public class CustomerController {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	
	@Autowired
	private CustomerService customerService;

	@Autowired
	public CustomerController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@GetMapping(path = "/customer/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Long customerId) {
		return new ResponseEntity<Customer>(
				customerService.getCustomerById(customerId),
				HttpStatus.OK
		);
    }
	
	
	@GetMapping(path = "/customer")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return new ResponseEntity<List<Customer>>(
				customerService.getAllCustomers(),
				HttpStatus.OK
		);
    }
	
	@GetMapping(path = "/customer/page/{pageNo}")
	public ResponseEntity<List<Customer>> getAllCustomersByPage(@PathVariable("pageNo") int pageNo) {
		return new ResponseEntity<List<Customer>>(
				customerService.getAllCustomersByPage(new RowBounds(pageNo,2)),
				HttpStatus.OK
		);
    }

	@PostMapping(path = "/customer")
	public ResponseEntity<Void> addCustomer(@RequestBody Customer body) {
		customerService.saveCustomer(body);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}