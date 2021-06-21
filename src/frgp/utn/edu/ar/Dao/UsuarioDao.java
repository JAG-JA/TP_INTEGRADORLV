package frgp.utn.edu.ar.Dao;



import java.util.List;


import frgp.utn.edu.ar.models.Usuario;

public interface UsuarioDao {

	//Alta de Usuario
	public boolean insertarUsuario(Usuario Usuario);
	public Usuario getUserByUsernameAndPassword(String User,String Pass);
	public Usuario getUserById(int id);
	public List<Usuario> obtenerClientes();
	public boolean borradoLogico(String id);
}
