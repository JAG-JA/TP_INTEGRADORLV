package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.dao.TipoCuentaDao;
import frgp.utn.edu.ar.models.TipoCuenta;

@Repository
public class TipoCuentaDaoImpl implements TipoCuentaDao{

	Session session =  HibernateConf.getSessionFactory().openSession();
	
	@Override
	public TipoCuenta findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoCuenta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoCuenta findById(Long id) {
		return null;
	}

	@Override
	public TipoCuenta save(TipoCuenta tipoCuenta) {
		   //Session session = HibernateConf.getSessionFactory().openSession();
		   session.save(tipoCuenta); 
		   //session.close();
		   return tipoCuenta;
	}

	@Override
	public void delete(TipoCuenta object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipoCuenta findTipoCuentaById(int idTipoCuenta) {
		//Session session =  HibernateConf.getSessionFactory().openSession();
		TipoCuenta sTipoCuenta = session.get(TipoCuenta.class, idTipoCuenta);
		//session.close();
	   	return sTipoCuenta;
	}

}
