package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;

import frgp.utn.edu.ar.dao.TransferenciaDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Transferencia;

public class TransferenciaDaoImpl implements TransferenciaDao{

	@Override
	public Transferencia findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transferencia> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transferencia findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transferencia save(Transferencia transferencia) {
		// TODO Auto-generated method stub
	   Session session = HibernateConf.getSessionFactory().openSession();
	   session.save(transferencia); 
	   session.close();
	   return transferencia;
	}

	@Override
	public void delete(Transferencia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
