package com.niit.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.inventory.model.Customer;
import com.niit.inventory.model.Product;
import com.niit.inventory.repository.CustomerRepository;
import com.niit.inventory.repository.UserRepository;


@Service
@Transactional
public class LoginService {
@Autowired
private CustomerRepository crepo;

public void saveCustomer(Customer customer)
{
	crepo.save(customer);
}
public List<Customer> listAll(){
	return crepo.findAll();
}

@Autowired
private UserRepository urepo;
public Customer findByEmail(String email)
{
	return urepo.findByEmail(email);
}


public Customer get(long id)
{
	return crepo.findById(id).get();
}

}
