package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Cliente;

public interface ClienteDao extends Crud<Cliente> {
	
	Cliente findClienteByUsuario(int idUsuario);

}
