package frgp.utn.edu.ar.util;

import frgp.utn.edu.ar.dao.ClienteDao;
import frgp.utn.edu.ar.dao.impl.ClienteDaoImpl;

public class Load {

	public ClienteDao clienteDao = new  ClienteDaoImpl();
	
	public void cargarCliente(int cant){

		for (int i = 0; i < cant; i++) {
			clienteDao.save(GenerarCliente.genearCliente()) ;     
		}
		
	
		
		
	}
}
