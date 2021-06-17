package frgp.utn.edu.ar.config;

import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
	 SessionFactory session  =  HibernateConf.getSessionFactory();
	 session.close();

	}

}
