package com.niit.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.inventory.model.Product;
import com.niit.inventory.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository prepo;
	
	public List<Product> listAll(){
		return prepo.findAll();
	}
	public void save(Product product)
	{
		prepo.save(product);
	}
	
	public Product get(long id)
	{
		return prepo.findById(id).get();
	}
	public void delete(long id)
	{
		prepo.deleteById(id);
	}
	

}
