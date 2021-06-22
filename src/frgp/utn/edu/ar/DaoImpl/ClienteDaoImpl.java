package frgp.utn.edu.ar.DaoImpl;

import java.util.List;

import org.hibernate.Session;

import frgp.utn.edu.ar.Dao.ClienteDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Cliente;

public class ClienteDaoImpl  implements ClienteDao{

	@Override
	public Cliente findByName(String name) {
		// TODO Auto-generated method stub
		return null;
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

}
