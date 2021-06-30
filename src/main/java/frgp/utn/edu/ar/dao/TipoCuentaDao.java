package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.TipoCuenta;

public interface TipoCuentaDao extends Crud<TipoCuenta>{

	TipoCuenta findTipoCuentaById(int idTipoCuenta);
}