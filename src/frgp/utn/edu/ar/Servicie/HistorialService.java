package ar.com.utn.integrador.service;

import java.util.List;

import ar.com.utn.integrador.generic.Crud;
import ar.com.utn.integrador.models.Movimiento;

public interface HistorialService  extends Crud<Movimiento>{

	List<Movimiento> findAllByCuenta(String cuenta_c);
}

