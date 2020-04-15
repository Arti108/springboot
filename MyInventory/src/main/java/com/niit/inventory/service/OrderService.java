package com.niit.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.inventory.model.Order1;
import com.niit.inventory.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository orepo;
	
	public List<Order1> listAll(){
		return orepo.findAll();
	}
	public void save(Order1 order)
	{
		orepo.save(order);
	}
	
	public Order1 get(long id)
	{
		return orepo.findById(id).get();
	}
	public void delete(long id)
	{
		orepo.deleteById(id);
	}
	

}
