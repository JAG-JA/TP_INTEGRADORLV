package frgp.utn.edu.ar.models;

public class Localidad {

	private int cp;
	private String localidad;
	private Provincia provincia;
	private Boolean activo;
	
	public Localidad() {
		
	}


	public Localidad(int cp, String localidad, Boolean activo) {
		this.cp = cp;
		this.localidad = localidad;
		this.activo = activo;
	}



	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Localidad [CP=" + cp + ", Localidad=" + localidad + "]";
	}
}
