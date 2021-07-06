 package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Usuario;

public interface CuentaDao extends Crud<Cuenta> {
	
	public Cuenta getCuenta(String cuenta);
	

}
