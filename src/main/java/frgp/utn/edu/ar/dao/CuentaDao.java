 package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Cuenta;

public interface CuentaDao extends Crud<Cuenta> {
	
	public Cuenta getCuenta(String cuenta);
	void  updateCuenta(Cuenta cuenta);
	void  update(Cuenta cuenta);

}
