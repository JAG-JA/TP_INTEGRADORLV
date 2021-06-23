package frgp.utn.edu.ar.main;

import org.hibernate.SessionFactory;

import frgp.utn.edu.ar.Dao.ClienteDao;
import frgp.utn.edu.ar.DaoImpl.ClienteDaoImpl;
import frgp.utn.edu.ar.DaoImpl.RolDaoImpl;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Rol;
import frgp.utn.edu.ar.util.Load;

public class Main {

	public static void main(String[] args) {
	//Instancio un objeto session factory, aca se crearan las tablas de la base de dato segun el model. 
	 SessionFactory session  =  HibernateConf.getSessionFactory();
	  

	 //----------------Rol------------------//
	 RolDaoImpl rolDao = new  RolDaoImpl();

	 Rol rol1 = new Rol(1,"Adminitrador");
	 Rol rol2 = new Rol(2,"Cliente");
	 
	 rolDao.save(rol1);
	 rolDao.save(rol2);
	 //--------------------------------------//
	 

	 //----------------Clientes--------------//
	 Load sLoad= new Load();
	 sLoad.cargarCliente(10);
	 //--------------------------------------//
	 




	 
	 

	}

}
