package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.TipoMovimientoDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.TipoMovimiento;
@Repository
public class TipoMovimientoDaoImpl implements TipoMovimientoDao{

	Session session =  HibernateConf.getSessionFactory().openSession();
	
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
	   
		//Session session = HibernateConf.getSessionFactory().openSession();
		   session.save(tipoMovimiento); 
		   //session.close();
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

	@SuppressWarnings("deprecation")
	@Override
	public TipoMovimiento findTipoMovimientoById(int idTipoMovimiento) {
		//Session session = HibernateConf.getSessionFactory().openSession();
		NativeQuery  query = session.createSQLQuery("SELECT * FROM TIPOMOVIMIENTO WHERE IDTIPOMOVIMIENTO = :ID");
		query.addEntity(TipoMovimiento.class);
		query.setParameter("ID", idTipoMovimiento);
	    List<?>  sList =  query.getResultList();
	    //session.close();
	    return    sList.size() > 0 ? (TipoMovimiento) sList.get(0)  : null;
	}
	
}
