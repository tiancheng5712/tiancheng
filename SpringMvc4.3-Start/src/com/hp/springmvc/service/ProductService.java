package com.hp.springmvc.service;

import java.util.Map;

import com.hp.springmvc.domain.Product;

public interface ProductService {

	Product add(Product product);
	Product get(long id);
	Map<Long, Product> getProductMap();
	Product Change(Product product);
	void del(Long id);
}
