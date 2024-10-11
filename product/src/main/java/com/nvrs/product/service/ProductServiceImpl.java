package com.nvrs.product.service;

import com.nvrs.product.mapper.ProductMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nvrs.product.entity.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper productMapper;

	@Override
	public List<Product> getAllProductsByPage(RowBounds rb) {
		return productMapper.getAllProductsByPage(rb);
	}

	@Override
	public List<Product> getAllProducts() {
		return productMapper.findAll();
	}

	@Override
	public void saveProduct(Product body) {
		productMapper.save(body);
	}

	@Override
	public Product getProductById(Long productId) {
		return productMapper.findById(productId);
	}
}
