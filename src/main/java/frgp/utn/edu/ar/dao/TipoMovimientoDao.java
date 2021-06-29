package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.TipoMovimiento;

public interface TipoMovimientoDao extends Crud<TipoMovimiento>{

	TipoMovimiento findTipoMovimientoById(int idTipoMovimiento);
}
