package com.infinite.Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
	
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employ employ1 = new Employ();
		employ1.setName("Sahithi");
		employ1.setDept("Java");
		employ1.setDesig("Manager");
		employ1.setBasic(99328.44);
		
		workStation workStation1 = new workStation();
		workStation1.setFloorNo("First Floor");
		workStation1.setCubicalId("c3");
		workStation1.setDomain("condenent");
		workStation1.setRackFacility("Yes");
		employ1.setWorkStation(workStation1);
		workStation1.setEmploy(employ1);
		session.save(employ1);
		transaction.commit();
		System.out.println("Tables are created...");
		
	}

}
