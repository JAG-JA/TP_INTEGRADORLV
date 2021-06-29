package frgp.utn.edu.ar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.LocalidadDao;
import frgp.utn.edu.ar.models.Localidad;
import frgp.utn.edu.ar.service.LocalidadService;

@Service
public class LocalidadServiceImpl implements LocalidadService {

	@Autowired
	private LocalidadDao localidadDao;
	@Override
	public Localidad findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Localidad> findAll() {
		// TODO Auto-generated method stub
		return localidadDao.findAll();
	}

	@Override
	public Localidad findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Localidad save(Localidad object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Localidad object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
