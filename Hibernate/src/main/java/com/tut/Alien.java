package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private String city;
	
	public int getAid() {
		return aid;
	}
	public  void setAid(int aid) {
		this.aid=aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname=aname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	

}
