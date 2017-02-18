package com.hp.springmvc.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.hp.springmvc.domain.Product;
import com.hp.springmvc.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	private Map<Long, Product> products=new HashMap<Long,Product>();
	private AtomicLong generator=new AtomicLong();
	
	public ProductServiceImpl(){
		Product product=new Product();
		product.setName("MiBook");
		product.setDescription("MiBook write code is very cool!");
		product.setPrice(4999.0d);
		product.setAddress("ÖÐ¹ú");
		product.setNeed("yes");
		add(product);
	}

	@Override
	public Product add(Product product) {
		long newid=generator.incrementAndGet();
		product.setId(newid);
		products.put(newid, product);
		return product;
	}
	@Override
	public void del(Long id){
		products.remove(id);
	}
	@Override
	public Product get(long id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}
	@Override
	public Map<Long, Product> getProductMap() {
		return products;
	}
	
	public Product Change(Product product) {
		products.put(product.getId(), product);
		return product;
	}
}
