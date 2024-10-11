package com.nvrs.product.service;

import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;

import com.nvrs.product.entity.Product;

import java.util.List;


public interface ProductService {

	List<Product> getAllProducts();

	List<Product> getAllProductsByPage(RowBounds rb);

	void saveProduct(Product body);

	Product getProductById(Long productId);
}