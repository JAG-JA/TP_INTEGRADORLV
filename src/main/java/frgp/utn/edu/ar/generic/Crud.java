package frgp.utn.edu.ar.generic;

import java.util.List;

public interface Crud <T>{
		   
		T findByName(String name);

	    List<T> findAll();

	    T findById(Long id);

	    T save(T object);

	    void delete(T object);

	    void deleteById(Long id);
	
}
