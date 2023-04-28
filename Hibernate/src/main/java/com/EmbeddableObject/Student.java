package com.EmbeddableObject;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	private Certificate certi;
	
	public int getSId() {
		return sId;
	}
	public void setSId(int sId) {
		this.sId=sId;
	}
	
	public String getSName() {
		return sName;
	}
	public void setSName(String sName) {
		this.sName=sName;
	}
	
	public Certificate getCerti() {
		return certi;
	}
	public void setcerti(Certificate certi) {
		this.certi=certi;
	}
}
