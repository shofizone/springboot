package com.example.springboot.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	String cId;
	String cName;
	String cAddress;
	
	public Customer() {
	
	}
	
	
	public Customer(String cId, String cName, String cAddress) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
	}
	
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	
	
	

}
