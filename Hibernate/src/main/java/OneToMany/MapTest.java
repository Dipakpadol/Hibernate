package OneToMany;

import java.util.ArrayList;
import java.util.List;

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
		a.setQuestion(q);
		
     	Answer a1=new Answer();
		a1.setAnswerId(12);
		a1.setAnswer("Java Is Used to develop application");
		a1.setQuestion(q);
		
		Answer a2=new Answer();
		a2.setAnswerId(13);
		a2.setAnswer("Java Is widely used");
		a2.setQuestion(q);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
		q.setAnswer(list);
		
		Session session=factory.openSession();
		session.save(q);
		session.save(a);
		session.save(a1);
		session.save(a2);
		
		
		
		Transaction t=session.beginTransaction();
		t.commit();
		factory.close();

	}

}
