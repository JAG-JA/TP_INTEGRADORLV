package frgp.utn.edu.ar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.HistorialDao;
import frgp.utn.edu.ar.models.Movimiento;
import frgp.utn.edu.ar.service.HistorialService;



@Service
public class HistorialServiceImpl implements HistorialService {
	
	@Autowired
	private HistorialDao historialDao;

	@Override
	public Movimiento findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movimiento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movimiento findById(Long id) {
		// TODO Auto-generated method stub
		return historialDao.findById(id);
	}

	@Override
	public Movimiento save(Movimiento object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Movimiento object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Movimiento> findAllByCuenta(String cuenta_c) {
		// TODO Auto-generated method stub
		return historialDao.findAllByCuenta(cuenta_c);
	}

}
