package com.OneToManyMapping;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
 private int customerId;
 private String customerName;
 
 @OneToMany
 private List<Orders> order;

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public List<Orders> getOrder() {
	return order;
}

public void setOrder(List<Orders> order) {
	this.order = order;
}
 
 
}
