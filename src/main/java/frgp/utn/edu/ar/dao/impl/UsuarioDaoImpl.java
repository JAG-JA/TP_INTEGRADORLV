package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import frgp.utn.edu.ar.dao.UsuarioDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Usuario;



public class UsuarioDaoImpl implements UsuarioDao {

	private SessionFactory  sessionFactory = HibernateConf.getSessionFactory();
	
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

	/*@Override
	public Usuario getUser(Usuario usr) {
    
	 Session session = HibernateConf.getSessionFactory().openSession();
	 Query query =  session.createQuery("SELECT * FROM USUARIO WHERE USUARIO =: USUARIO AND PASSWORD =:PASS");	 
	 query.setParameter("USUARIO", usr.getIdUsuario());
	 query.setParameter("PASS", usr.getPassword());
	 List<?>  sList =  query.getResultList();
	 
	 Usuario usuarioValid = (Usuario) sList.get(0);
	return usuarioValid;
	}*/
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public Usuario getUser(Usuario usr) {
    
	 Session session = HibernateConf.getSessionFactory().openSession();
	 NativeQuery query =  session.createSQLQuery("SELECT * FROM USUARIO WHERE USERNAME =:USUARIO AND PASSWORD =:PASS");	 
	 query.setParameter("USUARIO", usr.getUserName());
	 query.setParameter("PASS", usr.getPassword());
	 query.addEntity(Usuario.class);
	 List<?>  sList =  query.getResultList();
	 
	 return    sList.size() > 0 ? (Usuario) sList.get(0)  : null;

}
