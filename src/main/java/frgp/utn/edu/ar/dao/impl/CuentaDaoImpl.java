package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Usuario;



@Repository
public class CuentaDaoImpl implements CuentaDao {

    private Session session = HibernateConf.getSessionFactory().openSession();	
    
    @SuppressWarnings({ "deprecation", "rawtypes" })
    @Override
	public Cuenta findByName(String name) {
	    NativeQuery  query = session.createSQLQuery("SELECT * FROM CUENTA WHERE nroCuenta = :name");
		query.addEntity(Cuenta.class);
		query.setParameter("name", name);
	    List<?>  sList =  query.getResultList();
	    return    sList.size() > 0 ? (Cuenta) sList.get(0)  : null;

	}
    
	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public Cuenta findById(Long id) {
	    NativeQuery  query = session.createSQLQuery("SELECT * FROM CUENTA WHERE idCuenta = :idCuenta");
		query.addEntity(Cuenta.class);
		query.setParameter("idCuenta", id);
	    List<?>  sList =  query.getResultList();
	    return    sList.size() > 0 ? (Cuenta) sList.get(0)  : null;
	}

	@Override
	public List<Cuenta> findAll() {
		// TODO Auto-generated method stub
		return null;
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
	public Cuenta getCuenta(String cuenta) {
		// TODO Auto-generated method stub
		return null;
	}
}
