package org.btm.firstHibernateinsertApp;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class DAO {

	public static void main(String[] args) {
		student s = new student();
		s.setName("Soumya");
		s.setAddress("Karanataka");
		Configuration conf= new Configuration();
		conf.configure();
		
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		 Transaction tran = ses.beginTransaction();
		 
		 ses.save(s);
		 tran.commit();
		 ses.close();

		
	}

}
