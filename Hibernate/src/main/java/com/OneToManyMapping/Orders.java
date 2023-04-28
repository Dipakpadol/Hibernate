package com.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	private int ordersId;
	private String ordername;
	
	
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

}
