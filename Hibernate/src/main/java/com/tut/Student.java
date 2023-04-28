package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
    private int studentID;
    private String studentNAME;
    private String studentCITY;
     
    public int getStudentID() {
    	return studentID;
    }
    public void setStudentID(int studentID) {
    	this.studentID=studentID;
    }
    
    public String getStudentNAME() {
    	return studentNAME;
    }
    public void setStudentNAME(String studentNAME) {
    	this.studentNAME=studentNAME;
    }
    
    public String setStudentCITY() {
    	return studentCITY;
    }
    public void setStudentCITY(String studentCITY) {
    	this.studentCITY=studentCITY;
    }
    
}
