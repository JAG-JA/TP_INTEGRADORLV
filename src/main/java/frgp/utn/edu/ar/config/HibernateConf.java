package frgp.utn.edu.ar.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConf {
    
	private static final SessionFactory  sessionFactory;
	
	static {
		
		sessionFactory  = new  Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory  getSessionFactory() {
		return sessionFactory;
	}
	
}
