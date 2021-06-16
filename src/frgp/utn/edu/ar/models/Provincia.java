package frgp.utn.edu.ar.models;


public class Provincia  {


	private int IdProvincia;
	private String Provincia;
	private Boolean Activo;
	
	
	
	@Override
	public String toString() {
		return "Provincia [Provincia=" + Provincia + ", Provincia=" + Provincia + ", Activo=" + Activo + "]";
	}



	public int getIdProvincia() {
		return IdProvincia;
	}



	public String getProvincia() {
		return Provincia;
	}



	public void setProvincia(String provincia) {
		Provincia = provincia;
	}



	public Boolean getActivo() {
		return Activo;
	}



	public void setActivo(Boolean activo) {
		Activo = activo;
	}



	public Provincia() {
		
	}
}
