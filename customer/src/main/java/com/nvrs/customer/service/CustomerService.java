package com.nvrs.customer.service;

import java.util.List;
import java.util.Optional;

import com.nvrs.customer.entity.Customer;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;


public interface CustomerService {

	List<Customer> getAllCustomers();

	List<Customer> getAllCustomersByPage(RowBounds rb);

	void saveCustomer(Customer body);

	Customer getCustomerById(Long id);

}