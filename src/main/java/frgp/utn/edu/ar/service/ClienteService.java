package frgp.utn.edu.ar.service;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Cliente;

public interface ClienteService  extends  Crud<Cliente>{
	Cliente findClienteByUsuario(int idUsuario);
	void updateCliente(Cliente cliente);
}
