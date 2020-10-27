package com.hcl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Emp e = new Emp();
		e.setEno(1);
		e.setEname("Steve");
		e.setAddress("Chennai");
		session.persist(e);
		tx.commit();
		session.close();
		factory.close();
	}

}
