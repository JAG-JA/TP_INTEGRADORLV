package frgp.utn.edu.ar.util;

import frgp.utn.edu.ar.dao.ClienteDao;
import frgp.utn.edu.ar.dao.MovimientoDao;
import frgp.utn.edu.ar.dao.impl.ClienteDaoImpl;
import frgp.utn.edu.ar.dao.impl.MovimientoDaoImpl;
import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Movimiento;

public class Load {

	public ClienteDao clienteDao = new  ClienteDaoImpl();
	public MovimientoDao movimientoDao = new  MovimientoDaoImpl();
	
	public void cargarCliente(int cant){
		Movimiento sMovimiento = new Movimiento();
		
		for (int i = 0; i < cant; i++) {
			Cliente sCliente = clienteDao.save(GenerarCliente.generarCliente());


		    sMovimiento=GenerarMovimiento.getMovimiento(100400.01, sCliente.getCuenta().get(0));
			movimientoDao.save(sMovimiento);
			
		    sMovimiento=GenerarMovimiento.getMovimiento(1200.21, sCliente.getCuenta().get(0));
			movimientoDao.save(sMovimiento);
			
		    sMovimiento=GenerarMovimiento.getMovimiento(-2300.12, sCliente.getCuenta().get(0));
			movimientoDao.save(sMovimiento);
		    
		}
		
		clienteDao.save(GenerarCliente.generarAdministrador());
		
	}
}
