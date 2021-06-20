package frgp.utn.edu.ar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOCALIDAD")
public class Localidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cp;
	private String localidad;
	private Long idProvincia;
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

	public Long getProvincia() {
		return idProvincia;
	}


	public void setProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	@Override
	public String toString() {
		return "Localidad [CP=" + cp + ", Localidad=" + localidad + "]";
	}
}
