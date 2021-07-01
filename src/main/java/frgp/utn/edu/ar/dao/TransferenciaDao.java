package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Transferencia;

public interface TransferenciaDao extends Crud<Transferencia> {

	Integer saveT(Transferencia sTransferencia);
	void update(Integer idTansferencia, Integer idMovimientoOrigen , Integer idMovimientoDestino);
}
