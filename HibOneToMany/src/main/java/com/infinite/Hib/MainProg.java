package com.infinite.Hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {
	
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question question1=new Question();
		question1.setQname("What is Java?");
		
		Answer ans1=new Answer();
		ans1.setAnswerName("Java is a programming anguage");
		ans1.setPostedBy("Prasanna Pappu");
		
		Answer ans2=new Answer();
		ans2.setAnswerName("By using Java we can make any kind of Application");
		ans2.setPostedBy("Sunil Kumar");
		
		List<Answer> IstAnswers1 = new ArrayList<Answer>();
		IstAnswers1.add(ans1);
		IstAnswers1.add(ans2);
		
		question1.setAnswers(IstAnswers1);
		session.save(question1);
		transaction.commit();
		System.out.println("Tables are created...");
	}

}
