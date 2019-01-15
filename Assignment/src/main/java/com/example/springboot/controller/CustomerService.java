package com.example.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.customer.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	public Customer getCustomers(String id) {
		
	
		Optional<Customer> customerOp = customerRepository.findById(id);
	
		if(customerOp.isPresent()) {
			Customer customer =  customerOp.get();
			return customer;
		}else {
			return new Customer();
		}
	}
	
	public void  addCustomer(Customer customer){
		customerRepository.save(customer);
	}
	public void  updateCustomer(String id,Customer customer){
		customerRepository.save(customer);
		
	}
	
	public void  deleteCustomer(String id){
		customerRepository.deleteById(id);
	}
	
}