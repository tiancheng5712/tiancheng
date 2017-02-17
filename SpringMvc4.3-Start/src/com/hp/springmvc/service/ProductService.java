package com.hp.springmvc.service;

import com.hp.springmvc.domain.Product;

public interface ProductService {

	Product add(Product product);
	Product get(long id);
}
