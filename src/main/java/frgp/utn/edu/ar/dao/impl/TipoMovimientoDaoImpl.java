package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;

import frgp.utn.edu.ar.dao.TipoMovimientoDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.TipoMovimiento;

public class TipoMovimientoDaoImpl implements TipoMovimientoDao{

	@Override
	public TipoMovimiento findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoMovimiento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoMovimiento findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoMovimiento save(TipoMovimiento tipoMovimiento) {
		   Session session = HibernateConf.getSessionFactory().openSession();
		   session.save(tipoMovimiento); 
		   session.close();
		   return tipoMovimiento;
	}

	@Override
	public void delete(TipoMovimiento object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
