package frgp.utn.edu.ar.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.ClienteDao;
import frgp.utn.edu.ar.dao.LocalidadDao;
import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Localidad;
import frgp.utn.edu.ar.models.Rol;
import frgp.utn.edu.ar.models.Usuario;
import frgp.utn.edu.ar.service.ClienteService;
import frgp.utn.edu.ar.util.GenerarCliente;



@Service
public class ClienteServiceImpl  implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;
	
	@Autowired
	private LocalidadDao localidadDao;
	
	@Override
	public Cliente findByName(String name) {
		// TODO Auto-generated method stub
		return clienteDao.findByName(name);
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id);
	}

	@Override
	public Cliente save(Cliente object) {
		Localidad loc = new Localidad();
				
		//loc = localidadDao.findByName(object.getLocalidad().getLocalidad());
		
		loc = localidadDao.findByName("Pacheco");
		
		List<Cuenta> sListCuenta = new ArrayList<Cuenta>();
		Usuario usr =new Usuario(object.getNombre() + "." + object.getApellido(), "1234" , new Rol(1));
		object.setUsuario(usr);
		sListCuenta.add(GenerarCliente.getCuenta());
		sListCuenta.get(0).setCliente(object);
		object.setCuenta(sListCuenta);
		object.setLocalidad(loc);
		
		return clienteDao.save(object);
	}
	
	


	@Override
	public void delete(Cliente object) {
		 clienteDao.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		 clienteDao.deleteById(id);
		
	}
	@Override
	public Cliente findClienteByUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return clienteDao.findClienteByUsuario(idUsuario);
	}
	
	@Override
	public void updateCliente(Cliente cliente) {
		//cliente.setActivo(false);
		clienteDao.updateCliente(cliente);
		
	}
	

}
