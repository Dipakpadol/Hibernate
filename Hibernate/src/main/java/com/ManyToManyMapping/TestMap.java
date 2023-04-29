package com.ManyToManyMapping;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestMap {

	public static void main(String[] args) {
		 
		Configuration con=new Configuration();
		con.configure();
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		
		Employee e1=new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("Dipak");
		
		
		Employee e2=new Employee();
		e2.setEmployeeId(2);
		e2.setEmployeeName("Nikhil");
		
		Project p1=new Project();
		p1.setProjectId(11);
		p1.setProjectName("ChatGPT");
		
		Project p2=new Project();
		p2.setProjectId(12);
		p2.setProjectName("Google Project");
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1); emplist.add(e2);
		List<Project> pjtlist=new ArrayList<Project>();
		pjtlist.add(p1); pjtlist.add(p2);
		
		e1.setProjects(pjtlist);
		e2.setProjects(pjtlist);
		p1.setEmployees(emplist);
		p2.setEmployees(emplist);
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
        Transaction t=session.beginTransaction();
        t.commit();
        
        session.close();
        factory.close();

	}

}
