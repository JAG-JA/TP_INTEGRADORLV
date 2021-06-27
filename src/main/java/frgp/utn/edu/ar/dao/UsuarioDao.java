package frgp.utn.edu.ar.dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Usuario;

public interface UsuarioDao extends Crud<Usuario> {
    public Usuario getUser(Usuario usr);
}
