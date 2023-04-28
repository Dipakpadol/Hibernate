package com.EmbeddableObject;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setSId(101);
		s1.setSName("DipakPadol");
		Certificate c1=new Certificate();
		c1.setCource("CoreJava development");
		c1.setDuration("6 months");
		s1.setcerti(c1);
		
		Student s2=new Student();
		s2.setSId(102);
		s2.setSName("DVPpatil");
		Certificate c2=new Certificate();
		c2.setCource("AdvancedJava development");
		c2.setDuration("3 months");
		s2.setcerti(c2);

          
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s1);
		session.save(s2);
		
		tx.commit();
		
		
			

	}

}
