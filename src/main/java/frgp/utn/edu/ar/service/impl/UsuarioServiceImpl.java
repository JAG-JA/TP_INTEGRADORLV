package frgp.utn.edu.ar.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.UsuarioDao;
import frgp.utn.edu.ar.dao.impl.UsuarioDaoImpl;
import frgp.utn.edu.ar.models.Usuario;
import frgp.utn.edu.ar.service.UsuarioService;



@Service
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDao  usuariDao  = new  UsuarioDaoImpl();
	
	@Override
	public Usuario findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Usuario object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario getUser(Usuario usr)  {
	   return usuariDao.getUser(usr);
	}

}
