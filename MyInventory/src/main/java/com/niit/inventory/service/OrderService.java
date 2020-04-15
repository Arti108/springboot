package com.niit.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.inventory.model.Order;
import com.niit.inventory.repository.OrderRepository;
@Service
@Transactional
public class OrderService {
	
	
		@Autowired
		private OrderRepository orepo;
		
		public List<Order> listAll(){
			return orepo.findAll();
		}
		public void save(Order order)
		{
			orepo.save(order);
		}
		
		public Order get(int id)
		{
			return orepo.findById(id).get();
		}
		public void delete(int id)
		{
			orepo.deleteById(id);
		}
		

	}


