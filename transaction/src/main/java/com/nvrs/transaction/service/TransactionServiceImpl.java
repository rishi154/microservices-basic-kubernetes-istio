package com.nvrs.transaction.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.nvrs.transaction.mapper.TransactionMapper;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;

import com.nvrs.transaction.entity.TranProduct;
import com.nvrs.transaction.entity.Transaction;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	TransactionMapper transactionMapper;

	@Value("${customer_service_url}")
	private String customerServiceURL;

	@Autowired
	DataSourceTransactionManager transactionManager;

	@Autowired
	WebClient httpClient;

	
	@Override
	public void createTransaction(Transaction body) throws Exception {
		
		if(!isValidMerchant(body.getMerchantId())) {
			throw new Exception("Invalid Merchant");
		}
		
		if(!isValidCustomer(body.getCustomerId())) {
			throw new Exception("Invalid Customer");
		}
		
		Transaction xtn = new Transaction();
		xtn.setMerchantId(body.getMerchantId());
		xtn.setCustomerId(body.getCustomerId());
		
		List<TranProduct> prodInTran = new ArrayList<TranProduct>();
		TranProduct tp = null;
		for(int i=0;i<body.getProducts().size();i++) {
			TranProduct prodBean = body.getProducts().get(i);
			tp = new TranProduct();
			tp.setDescription(prodBean.getDescription());
			tp.setQuantity(prodBean.getQuantity());
			tp.setPrice(prodBean.getPrice());
			prodInTran.add(tp);
		}
		xtn.setProducts(prodInTran);
		xtn.setStatus("SUCCESS");

		saveTransaction(xtn);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class, transactionManager = "transactionManager")
	public void saveTransaction(Transaction xtn) {
		transactionMapper.saveTransaction(xtn);
		transactionMapper.saveTransProduct(xtn.getProducts(), xtn.getTran_id());
	}

	@Override
	public Transaction getTransactionById(long tranId) {
		return transactionMapper.findById(tranId);
	}

	@Override
	public List<Transaction> getAllTransactions() {
		return transactionMapper.findAll();
	}

	private boolean isValidCustomer(Long customerId) {
		Object customer = restTemplate.getForObject(customerServiceURL+"/customer/"+customerId, Object.class);
        return customer != null;
    }

	private boolean isValidMerchant(Long merchantId) {
		Object merchant = httpClient
				.get()
				.uri("/merchant/"+merchantId)
				.retrieve()
				.bodyToMono(Object.class)
				.block();
		//Object merchant = restTemplate.getForObject(merchantServiceURL+"/merchant/"+merchantId, Object.class);
        return merchant != null;
    }

}
