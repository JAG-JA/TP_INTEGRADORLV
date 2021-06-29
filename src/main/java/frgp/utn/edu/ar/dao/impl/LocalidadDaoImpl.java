package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.dao.LocalidadDao;
import frgp.utn.edu.ar.models.Localidad;

@Repository
public class LocalidadDaoImpl implements LocalidadDao {

	@Override
	public Localidad findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Localidad> findAll() {
		Session session =  HibernateConf.getSessionFactory().openSession();
		return  session.createCriteria(Localidad.class).list();
		
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
