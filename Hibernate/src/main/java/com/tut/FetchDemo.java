package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure();
		
		SessionFactory factory=con.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s=(Student)session.get(Student.class, 1);
		System.out.println(s.getStudentNAME()+" "+s.setStudentCITY());

	}

}
