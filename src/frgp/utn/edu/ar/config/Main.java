package ar.com.utn.integrador.config;

import org.hibernate.SessionFactory;

import ar.com.utn.integrador.util.Load;

public class Main {

	public static void main(String[] args) {
		 SessionFactory session  =  HibernateConf.getSessionFactory();	 
		 Load sLoad= new Load();
		 sLoad.cargarCliente(10);

	}

}
