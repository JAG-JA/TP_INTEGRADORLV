package frgp.utn.edu.ar.config;

import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
		//Instancio un objeto session factory, aca se crearan las tablas de la base de dato segun el model. 
	 SessionFactory session  =  HibernateConf.getSessionFactory();
	 
	 session.close();

	}

}
