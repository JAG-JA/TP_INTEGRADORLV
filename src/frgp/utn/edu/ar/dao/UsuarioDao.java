package frgp.utn.edu.ar.Dao;

import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Usuario;

public interface UsuarioDao extends Crud<Usuario> {
    public Usuario getUser(Usuario usr);
}
