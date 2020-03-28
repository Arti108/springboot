package com.niit.techno.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.techno.crm.dao.CustomerDAO;
import com.niit.techno.crm.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{
@Autowired
private CustomerDAO customerDAO;

@Override
@Transactional
public void saveCustomer(Customer theCustomer) {
customerDAO.saveCustomer(theCustomer);

}

@Override
@Transactional
public List<Customer> getCustomers() {
	// TODO Auto-generated method stub
	return customerDAO.getCustomers();
}

}

