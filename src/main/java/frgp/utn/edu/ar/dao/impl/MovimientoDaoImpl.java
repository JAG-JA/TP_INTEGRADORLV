package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.MovimientoDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Movimiento;
@Repository
public class MovimientoDaoImpl implements MovimientoDao{

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
		return null;
	}

	@Override
	public Movimiento save(Movimiento movimiento) {
	   Session session = HibernateConf.getSessionFactory().openSession();
	   session.save(movimiento); 
	   session.close();
	   return movimiento;
	}

	@Override
	public void delete(Movimiento object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
