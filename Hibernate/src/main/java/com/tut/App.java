package com.tut;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {

	public static void main(String[] args) {
		
              System.out.println("Project Started !!!");
              
              /*Alien dvp=new Alien();
              dvp.setAid(103);
              dvp.setAname("Nikhil");
              dvp.setCity("Banglore");*/
              
              Student s=new Student();
              s.setStudentID(1);
              s.setStudentNAME("DVPPatil");
              s.setStudentCITY("Mumbai");
              
              Address ad=new Address();
             
              ad.setStreet("street1");
              ad.setCity("Pune");
              ad.setOpen(true);
              ad.setX(12.23);
              ad.setAddedDate(new Date());
              ad.setAddressID(1);
              
              
              Configuration con=new Configuration();
              con.configure();
              SessionFactory factory=con.buildSessionFactory();
              
              Session session=factory.openSession();
              
              Transaction tx=session.beginTransaction();
              
              session.save(s); //sesssion.save(dvp);
              session.save(ad);
              tx.commit(); 
	
	}
}
