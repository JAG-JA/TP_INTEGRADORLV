package frgp.utn.edu.ar.service;

import java.util.List;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Movimiento;

public interface HistorialService  extends Crud<Movimiento>{

	List<Movimiento> findAllByCuenta(String cuenta_c);
}

