package frgp.utn.edu.ar.ServiciosImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.utn.integrador.dao.ClienteDao;
import frgp.utn.edu.ar.Servicios.ClienteService;
import frgp.utn.edu.ar.models.Cliente;

@Service
public class ClienteServiceImpl  implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;
	@Override
	public Cliente findByName(String name) {
		// TODO Auto-generated method stub
		return clienteDao.findByName(name);
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Cliente object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Cliente findClienteByUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return clienteDao.findClienteByUsuario(idUsuario);
	}

}
