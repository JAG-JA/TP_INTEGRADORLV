package frgp.utn.edu.ar.Servicios;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Usuario;

public interface UsuarioService  extends Crud<Usuario>{

	public Usuario getUser(Usuario usr);
}
