package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.dao.ClienteDao;
import frgp.utn.edu.ar.models.Cliente;


@Repository
public class ClienteDaoImpl  implements ClienteDao{
   
	Session session =  HibernateConf.getSessionFactory().openSession();
	
	@SuppressWarnings("deprecation")
	@Override
	public Cliente findByName(String name) {	
		//Session session =  HibernateConf.getSessionFactory().openSession();
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE NOMBRE = :NOMBRE AND ACTIVO = 1");
		query.addEntity(Cliente.class);
		query.setParameter("NOMBRE", name);
	    List<?>  sList =  query.getResultList();
	    //session.close();
	    return    sList.size() > 0 ? (Cliente) sList.get(0)  : null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Cliente> findAll() {
		//Session session =  HibernateConf.getSessionFactory().openSession();
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE  ACTIVO = 1");
		query.addEntity(Cliente.class);
	    //List<Cliente>  sList =  query.getResultList();
	    //session.close();
	    return   query.getResultList(); // sList.size() > 0 ? sList  : null;
	}

	@Override
	public Cliente findById(Long id) {
		//Session session =  HibernateConf.getSessionFactory().openSession();
		Cliente sCliente = session.get(Cliente.class, id.intValue());
		//session.close();
	   	return sCliente;
	}

	@Override
	public Cliente save(Cliente object) {
		//Session session = HibernateConf.getSessionFactory().openSession();
	   session.save(object); 
	   //session.close();
	   return object;
	}

	@Override
	public void delete(Cliente object) {
		//Session session = HibernateConf.getSessionFactory().openSession();
		session.getTransaction().begin();
		NativeQuery  query = session.createSQLQuery("update cliente set activo = 1  where idcliente = :ID");
		query.addEntity(Cliente.class);
		query.setParameter("ID", object.getIdCliente());
		int id = query.executeUpdate();
		System.out.println("el id " + id);
		session.getTransaction().commit();
		//session.close();
		
		/*
	    Session session = HibernateConf.getSessionFactory().openSession();
		session.delete(object);
	    session.close();*/
		
	}
	
	
	
	@Override
	public void deleteById(Long id) {
	 
		
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public Cliente findClienteByUsuario(int idUsuario) {
		//Session session = HibernateConf.getSessionFactory().openSession();
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE USUARIO_C = :ID");
		query.addEntity(Cliente.class);
		query.setParameter("ID", idUsuario);
	    List<?>  sList =  query.getResultList();
	    //session.close();
	    return    sList.size() > 0 ? (Cliente) sList.get(0)  : null; 
		
	}

	@Override
	public void updateCliente(Cliente cliente) {
		
	}
}
