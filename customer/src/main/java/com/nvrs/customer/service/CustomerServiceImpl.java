package com.nvrs.customer.service;

import java.util.List;

import com.nvrs.customer.mapper.CustomerMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.nvrs.customer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerMapper customerMapper;

	@Override
	public List<Customer> getAllCustomersByPage(RowBounds rb) {
		return customerMapper.getAllCustomersByPage(rb);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerMapper.findAll();
	}

	@Override
	public void saveCustomer(Customer body) {
		customerMapper.save(body);
	}

	@Override
	public Customer getCustomerById(Long id){
		return customerMapper.findById(id);
	}

}
