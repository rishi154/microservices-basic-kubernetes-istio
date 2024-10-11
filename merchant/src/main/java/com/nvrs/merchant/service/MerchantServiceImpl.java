package com.nvrs.merchant.service;

import java.util.List;

import com.nvrs.merchant.mapper.MerchantMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nvrs.merchant.entity.Merchant;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	MerchantMapper merchantMapper;

	@Override
	public List<Merchant> getAllMerchantsByPage(RowBounds rb) {
		return merchantMapper.getAllMerchantsByPage(rb);
	}

	@Override
	public List<Merchant> getAllMerchants() {
		return merchantMapper.findAll();
	}

	@Override
	public void saveMerchant(Merchant body) {
		merchantMapper.save(body);
	}
	
	@Override
	public Merchant getMerchantById(Long id){
		return merchantMapper.findById(id);
	}

}
