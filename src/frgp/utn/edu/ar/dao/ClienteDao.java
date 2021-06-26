package frgp.utn.edu.ar.Dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Cliente;

public interface ClienteDao extends Crud<Cliente> {

	Cliente findClienteByUsuario(int idUsuario);
}
