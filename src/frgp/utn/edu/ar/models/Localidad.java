package frgp.utn.edu.ar.models;

public class Localidad {

	private int CP;
	private String Localidad;
	private Provincia provincia;
	private Boolean Activo;
	
	public Localidad() {
		
	}


	public Localidad(int cP, String localidad, Boolean activo) {
		CP = cP;
		Localidad = localidad;
		Activo = activo;
	}



	public int getCP() {
		return CP;
	}
	public void setCP(int cP) {
		CP = cP;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	
	public Boolean getActivo() {
		return Activo;
	}

	public void setActivo(Boolean activo) {
		Activo = activo;
	}

	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Localidad [CP=" + CP + ", Localidad=" + Localidad + "]";
	}
}
