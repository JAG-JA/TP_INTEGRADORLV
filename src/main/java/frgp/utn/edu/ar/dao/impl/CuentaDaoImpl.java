package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Usuario;



@Repository
public class CuentaDaoImpl implements CuentaDao {

    Session session = HibernateConf.getSessionFactory().openSession();	
    
    @SuppressWarnings({ "deprecation", "rawtypes" })
    @Override
	public Cuenta findByName(String name) {
    	//Session session = HibernateConf.getSessionFactory().openSession();
	    NativeQuery  query = session.createSQLQuery("SELECT * FROM CUENTA WHERE nroCuenta = :name");
		query.addEntity(Cuenta.class);
		query.setParameter("name", name);
	    List<?>  sList =  query.getResultList();
	    //session.close();
	    return    sList.size() > 0 ? (Cuenta) sList.get(0)  : null;

	}
    
	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public Cuenta findById(Long id) {
		//Session session = HibernateConf.getSessionFactory().openSession();
	    NativeQuery  query = session.createSQLQuery("SELECT * FROM CUENTA WHERE idCuenta = :idCuenta");
		query.addEntity(Cuenta.class);
		query.setParameter("idCuenta", id);
	    List<?>  sList =  query.getResultList();
	    //session.close();
	    return    sList.size() > 0 ? (Cuenta) sList.get(0)  : null;
	}

	@Override
	public List<Cuenta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Cuenta save(Cuenta object) {
		//Session session = HibernateConf.getSessionFactory().openSession();
	   session.save(object); 
	   //session.close();
	   return object;
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

	@Override
	public void updateCuenta(Cuenta cuenta) {
		//Session session = HibernateConf.getSessionFactory().openSession();
		session.getTransaction().begin();
		NativeQuery  query = session.createSQLQuery("update cuenta set saldo = :SALDOCTA  where idcuenta = :ID");
		query.addEntity(Cliente.class);
		query.setParameter("ID", cuenta.getIdCuenta());
		query.setParameter("SALDOCTA", cuenta.getSaldo());
		int id = query.executeUpdate();
		System.out.println("el id " + id);
		session.getTransaction().commit();
		//session.close();		
	}
	
	@Override
	public void update(Cuenta object) {
		//Session session = HibernateConf.getSessionFactory().openSession();
	   session.saveOrUpdate(object); 
	   //session.close();
	}
}
