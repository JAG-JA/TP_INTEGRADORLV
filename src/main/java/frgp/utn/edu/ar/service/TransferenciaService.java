package frgp.utn.edu.ar.service;

import frgp.utn.edu.ar.dto.TransferenciaDto;
import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Transferencia;

public interface TransferenciaService extends Crud<Transferencia>{
	 void save (TransferenciaDto dto);
}
