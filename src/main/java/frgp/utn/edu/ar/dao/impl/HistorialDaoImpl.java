package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.dao.HistorialDao;
import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Movimiento;

@Repository
public class HistorialDaoImpl implements HistorialDao {
	Session session =  HibernateConf.getSessionFactory().openSession();
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Movimiento> findAllByCuenta(String cuenta_c) {
		NativeQuery  query = session.createSQLQuery("SELECT * FROM MOVIMIENTO WHERE CUENTA_C = :cuenta_c");
		query.addEntity(Movimiento.class);
		query.setParameter("cuenta_c", cuenta_c);
	    List<?>  sList =  query.getResultList();
	    return    sList.size() > 0 ? (List<Movimiento>) sList  : null;
	}

}
