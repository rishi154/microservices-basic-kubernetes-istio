package com.nvrs.merchant.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.nvrs.merchant.entity.Merchant;


public interface MerchantService {

	List<Merchant> getAllMerchants();

	List<Merchant> getAllMerchantsByPage(RowBounds rb);

	void saveMerchant(Merchant body);

	Merchant getMerchantById(Long id);

}