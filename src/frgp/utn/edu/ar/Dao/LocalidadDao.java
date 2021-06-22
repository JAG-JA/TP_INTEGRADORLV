

package frgp.utn.edu.ar.Dao;
import java.util.List;


public interface LocalidadDao {
	public List<frgp.utn.edu.ar.models.Localidad> obtenerTodos();
	public frgp.utn.edu.ar.models.Localidad obtenerLocalidad(Integer CP);
	public boolean InsertarLocalidad(frgp.utn.edu.ar.models.Localidad loc);
}

