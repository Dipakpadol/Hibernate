package com.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTest {

	public static void main(String[] args) {
	 
		Configuration con=new Configuration();
		con.configure();
		SessionFactory  factory=con.buildSessionFactory();
		
		Question q=new Question();
		q.setQuestionId(101);
		q.setQuestion("What is java");
		
		Answer a=new Answer();
		a.setAnswerId(11);
		a.setAnswer("Java Is a Programming language");
		q.setAnswer(a);
		
		Session session=factory.openSession();
		session.save(q);
		session.save(a);
		
		Transaction t=session.beginTransaction();
		t.commit();
		factory.close();

	}

}
