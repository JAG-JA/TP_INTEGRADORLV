package frgp.utn.edu.ar.DaoImpl;

import java.util.List;

import org.hibernate.Session;

import frgp.utn.edu.ar.Dao.RolDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Rol;

public class RolDaoImpl implements RolDao{

	@Override
	public Rol findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol save(Rol rol) {
	   Session session = HibernateConf.getSessionFactory().openSession();
	   session.save(rol); 
	   session.close();
	   return rol;
	}

	@Override
	public void delete(Rol object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}