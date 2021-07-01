package frgp.utn.edu.ar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.TransferenciaDao;
import frgp.utn.edu.ar.config.HibernateConf;
import frgp.utn.edu.ar.models.Transferencia;
@Repository
public class TransferenciaDaoImpl implements TransferenciaDao{

	@Override
	public Transferencia findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transferencia> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transferencia findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transferencia save(Transferencia transferencia) {
		// TODO Auto-generated method stub
	   Session session = HibernateConf.getSessionFactory().openSession();
	   session.save(transferencia); 
	   session.close();
	   return transferencia;
	}

	@Override
	public void delete(Transferencia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer saveT(Transferencia sTransferencia) {
		Integer id = 0;
		try {
			Session session = HibernateConf.getSessionFactory().openSession();
			if(session.isOpen()) {
				session.getTransaction().begin();
				id = (Integer) session.save(sTransferencia); 
				session.getTransaction().commit();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public void update(Integer idTansferencia, Integer idMovimientoOrigen , Integer idMovimientoDestino ) {
		Session session = HibernateConf.getSessionFactory().openSession();
		session.getTransaction().begin();
		NativeQuery  query = session.createSQLQuery("update transferencia set  movimiento_origen= :idMovimientoOrigen ,movimiento_destino=:idMovimientoDestino  where idTransferencia = :idTansferencia");
		query.addEntity(Transferencia.class);
		query.setParameter("idTansferencia", idTansferencia);
		query.setParameter("idMovimientoOrigen", idMovimientoOrigen);
		query.setParameter("idMovimientoDestino", idMovimientoDestino);
		int id = query.executeUpdate();
		System.out.println("el id " + id);
		session.getTransaction().commit();
	}


}
