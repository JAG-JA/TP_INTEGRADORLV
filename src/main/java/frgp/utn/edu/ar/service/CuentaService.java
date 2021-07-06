package frgp.utn.edu.ar.service;
import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.*;

public interface CuentaService  extends Crud<Cuenta>{
	
	public Cuenta getCuenta(String string);

}
