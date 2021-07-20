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
	    
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE NOMBRE = :NOMBRE AND ACTIVO = 1");
		query.addEntity(Cliente.class);
		query.setParameter("NOMBRE", name);
	    List<?>  sList =  query.getResultList();
	    return    sList.size() > 0 ? (Cliente) sList.get(0)  : null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Cliente> findAll() {
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE  ACTIVO = 1");
		query.addEntity(Cliente.class);
		return  query.getResultList();
	}

	@Override
	public Cliente findById(Long id) {
	   	return session.get(Cliente.class, id.intValue());
	}

	@Override
	public Cliente save(Cliente object) {
	   
		
		try {
			   Session session = HibernateConf.getSessionFactory().openSession();
			   session.save(object); 
			   session.close();
		} catch (Exception ex) {
			System.out.print(ex.getMessage() + "Error al guardar los datos del cliente."); 
			}

	   return object;
	}

	@Override
	public void delete(Cliente object) {
		//Session session = HibernateConf.getSessionFactory().openSession();
		session.getTransaction().begin();
		NativeQuery  query = session.createSQLQuery("update cliente set activo = 0  where idcliente = :ID");
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
	    
		NativeQuery  query = session.createSQLQuery("SELECT * FROM CLIENTE WHERE USUARIO_C = :ID");
		query.addEntity(Cliente.class);
		query.setParameter("ID", idUsuario);
	    List<?>  sList =  query.getResultList();
	    return    sList.size() > 0 ? (Cliente) sList.get(0)  : null; 
		
	}

	@Override
	public void updateCliente(Cliente cliente) {
		session.getTransaction().begin();
		NativeQuery  query = session.createSQLQuery("update cliente set nacionalidad = :NAC, nombre = :NOMB, apellido = :APEL, sexo = :SEX, direccion = :DIRE, dni = :DNI, fechaNacimiento = :FECHA where idcliente = :ID"); //,localidad_c = :LOC  
		query.addEntity(Cliente.class);
		query.setParameter("ID", cliente.getIdCliente());
		query.setParameter("NAC", cliente.getNacionalidad());
		query.setParameter("NOMB", cliente.getNombre());
		query.setParameter("APEL", cliente.getApellido());
		query.setParameter("SEX", cliente.getSexo());
		query.setParameter("DNI", cliente.getDni());
		query.setParameter("DIRE", cliente.getDireccion());
		//query.setParameter("LOC", cliente.getLocalidad().getId());
		query.setParameter("FECHA", cliente.getFechaNacimiento());
				
		int id = query.executeUpdate();
		System.out.println("el id " + cliente.getIdCliente());
		System.out.println("el nombre " + cliente.getNombre());
		System.out.println("Fecha Nacimiento " + cliente.getFechaNacimiento());
		//System.out.println("ID Localidad" + cliente.getLocalidad().getId());
		session.getTransaction().commit();
		
	}
}
