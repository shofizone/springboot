package com.example.springboot.controller;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
