

package frgp.utn.edu.ar.Dao;
import java.util.List;
import frgp.utn.edu.ar.generic.Crud;
import frgp.utn.edu.ar.models.Localidad;


public interface LocalidadDao extends Crud <Localidad> {

	// Ejemplo de metodo propio de la interface
	public List<frgp.utn.edu.ar.models.Localidad> obtieneLocalidadescercanas(Integer CP);
	
}
	
	/*public List<frgp.utn.edu.ar.models.Localidad> obtenerTodos();
	public frgp.utn.edu.ar.models.Localidad obtenerLocalidad(Integer CP);
	public boolean InsertarLocalidad(frgp.utn.edu.ar.models.Localidad loc);
}*/

