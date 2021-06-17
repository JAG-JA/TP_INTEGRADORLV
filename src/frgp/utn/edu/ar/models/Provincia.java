package frgp.utn.edu.ar.models;


public class Provincia  {


	private int idProvincia;
	private String provincia;
	private Boolean activo;
	
	
	
	@Override
	public String toString() {
		return "Provincia [Provincia=" + provincia + ", Activo=" + activo + "]";
	}



	public int getIdProvincia() {
		return idProvincia;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public Boolean getActivo() {
		return activo;
	}



	public void setActivo(Boolean activo) {
		this.activo = activo;
	}



	public Provincia() {
		
	}
}
