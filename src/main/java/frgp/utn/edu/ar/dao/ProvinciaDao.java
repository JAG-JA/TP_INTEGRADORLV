package frgp.utn.edu.ar.dao;


import java.util.List;


import frgp.utn.edu.ar.models.Provincia;

	public interface ProvinciaDao {
		public Provincia obtenerProvincia(Integer id);
		public List<Provincia> obtenerTodos();
	}


