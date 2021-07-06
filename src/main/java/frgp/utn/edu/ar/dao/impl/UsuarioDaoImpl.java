package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.dao.UsuarioDao;
import frgp.utn.edu.ar.models.Usuario;



@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	Session session = HibernateConf.getSessionFactory().openSession();
	
	@Override
	public Usuario findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario save(Usuario object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Usuario object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public Usuario getUser(Usuario usr) {
    
	 //Session session = HibernateConf.getSessionFactory().openSession();
	 NativeQuery query =  session.createSQLQuery("SELECT * FROM USUARIO WHERE USERNAME =:USUARIO AND PASSWORD =:PASS");	 
	 query.setParameter("USUARIO", usr.getUserName());
	 query.setParameter("PASS", usr.getPassword());
	 query.addEntity(Usuario.class);
	 List<?>  sList =  query.getResultList();
	 //session.close();
	 return    sList.size() > 0 ? (Usuario) sList.get(0)  : null;
	
	}

}
