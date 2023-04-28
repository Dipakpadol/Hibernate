package com.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Implements {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		Customer c=new Customer();
		c.setCustomerId(101);
		c.setCustomerName("DipakPadol");
		
		Orders o=new Orders();
		o.setOrdersId(11);
		o.setOrdername("chicken Order");
		
		

		Orders o1=new Orders();
		o1.setOrdersId(12);
		o1.setOrdername("mutton Order");
		
		Orders o2=new Orders();
		o2.setOrdersId(13);
		o2.setOrdername("fish Order");
		
		List<Orders> list=new ArrayList<Orders>();
		list.add(o);
		list.add(o1);
		list.add(o2);
		
		session.save(c);
		session.save(list);
		
		Transaction tx=session.beginTransaction();
		tx.commit();
	    session.close();
	    factory.close();

	}
}
