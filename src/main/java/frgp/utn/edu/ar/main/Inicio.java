package frgp.utn.edu.ar.main;

import org.hibernate.SessionFactory;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.util.Load;

public class Inicio {

	public static void main(String[] args) {
		 SessionFactory session  =  HibernateConf.getSessionFactory();
		// session.close();
		 
		 Load sLoad= new Load();
		 sLoad.cargarCliente(10);

	}

}

