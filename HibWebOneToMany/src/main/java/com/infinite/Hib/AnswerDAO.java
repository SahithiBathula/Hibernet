package com.infinite.Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AnswerDAO {
	SessionFactory sessionFactory;

	public String addAnswer(Answer answer) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(answer);
		transaction.commit();
		return "Answer Added Successsfully...";
	}


}
