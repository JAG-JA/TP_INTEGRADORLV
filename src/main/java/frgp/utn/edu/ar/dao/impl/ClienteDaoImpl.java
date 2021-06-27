package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import frgp.utn.edu.ar.dao.ClienteDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Cliente;

public class ClienteDaoImpl  implements ClienteDao{

	Session session =  HibernateConf.getSessionFactory().openSession();

	@Override
	public Cliente findByName(String name) {	
	    
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE NOMBRE = :NOMBRE");
		query.addEntity(Cliente.class);
		query.setParameter("NOMBRE", name);
	    List<?>  sList =  query.getResultList();
	    return    sList.size() > 0 ? (Cliente) sList.get(0)  : null;
	}
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
	   Session session = HibernateConf.getSessionFactory().openSession();
	   session.save(cliente); 
	   session.close();
	   return cliente;
	}

	@Override
	public void delete(Cliente object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public Cliente findClienteByUsuario(int idUsuario) {
	    
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE USUARIO_C = :ID");
		query.addEntity(Cliente.class);
		query.setParameter("ID", idUsuario);
	    List<?>  sList =  query.getResultList();
	    return    sList.size() > 0 ? (Cliente) sList.get(0)  : null; 
		
	}

}
