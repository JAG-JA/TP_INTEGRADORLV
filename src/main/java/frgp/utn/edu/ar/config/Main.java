package frgp.utn.edu.ar.config;

import org.hibernate.SessionFactory;

import frgp.utn.edu.ar.util.Load;

public class Main {

	public static void main(String[] args) {
		 SessionFactory session  =  HibernateConf.getSessionFactory();	 
		 Load sLoad= new Load();
		 sLoad.cargarCliente(10);

	}

}
