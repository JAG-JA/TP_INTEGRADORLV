package frgp.utn.edu.ar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Usuario;
import frgp.utn.edu.ar.service.CuentaService;


@Service
public class CuentaServiceImpl implements CuentaService {
	
	@Autowired
	private CuentaDao cuentaDao;

	@Override
	public Cuenta findByName(String name) {
		return cuentaDao.findByName(name);
	}

	@Override
	public List<Cuenta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta findById(Long id) {
		// TODO Auto-generated method stub
		return cuentaDao.findById(id);
	}

	@Override
	public Cuenta save(Cuenta object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Cuenta object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cuenta getCuenta(String cuenta) 
	{
		 return cuentaDao.getCuenta(cuenta);
	}


	
}
