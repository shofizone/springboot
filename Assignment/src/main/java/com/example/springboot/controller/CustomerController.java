package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.customer.Customer;


@RestController
public class CustomerController {
	@Autowired 
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String home() {
		String s = "Spring Boot RAST api !."+
	" Entering 'localhost:port/customer' will allow to show all the customer in database."+
				" 'customer/id' will allow to show the that single customer."+
	" If there is nothing in database thin it will return null."+
				" It always return data in json format. ";
		
		return s;
		
				
	}
	
	@RequestMapping("/customer")
	public List<Customer> getAllCustomers() {
		
		return customerService.getAllCustomers();
				
	}
	
	
	@RequestMapping("/customer/{id}")
	public Customer getCustomers(@PathVariable String id) {
		
		return customerService.getCustomers(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/customer")
	public void addCustomer(@RequestBody Customer topci) {
		customerService.addCustomer(topci);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/customer/{id}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable String id) {
		customerService.updateCustomer(id,customer);
		
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/customer/{id}")
	public void deleteCustomer(@PathVariable String id) {
		 customerService.deleteCustomer(id);
		
	}

}
