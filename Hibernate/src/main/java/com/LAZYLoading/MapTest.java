package com.LAZYLoading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapTest {

	public static void main(String[] args) {
	 
		Configuration con=new Configuration();
		con.configure();
		SessionFactory  factory=con.buildSessionFactory();
		
		Session session=factory.openSession();	
		
		Question q=(Question)session.get(Question.class,101);
				System.out.println(q.getQuestionId());
				System.out.println(q.getQuestion());
				
				System.out.println(q.getAnswer().size());
		
	
		factory.close();

	}

}
