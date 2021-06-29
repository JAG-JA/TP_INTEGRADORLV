package frgp.utn.edu.ar.config;

import org.hibernate.SessionFactory;

import frgp.utn.edu.ar.dao.TipoMovimientoDao;
import frgp.utn.edu.ar.dao.impl.RolDaoImpl;
import frgp.utn.edu.ar.dao.impl.TipoMovimientoDaoImpl;
import frgp.utn.edu.ar.models.Rol;
import frgp.utn.edu.ar.models.TipoMovimiento;
import frgp.utn.edu.ar.util.Load;

public class Main {

	public static void main(String[] args) {
		 SessionFactory session  =  HibernateConf.getSessionFactory();	 

		 //----------------Rol------------------//
		 RolDaoImpl rolDao = new  RolDaoImpl();

		 Rol rol1 = new Rol(1,"Administrador");
		 Rol rol2 = new Rol(2,"Cliente");
		 
		 rolDao.save(rol1);
		 rolDao.save(rol2);
		 //--------------------------------------//
		 
		 //----------------Tipo Movimiento------------------//
		 TipoMovimientoDaoImpl TmDao = new  TipoMovimientoDaoImpl();

		 TipoMovimiento tm1 = new TipoMovimiento("Ingreso");
		 TipoMovimiento tm2 = new TipoMovimiento("Egreso");
		 
		 TmDao.save(tm1);
		 TmDao.save(tm2);
		 //--------------------------------------//
		 

		 //----------------Clientes--------------//
		 Load sLoad= new Load();
		 sLoad.cargarCliente(10);
		 //--------------------------------------//
		 
		 
	}

}
