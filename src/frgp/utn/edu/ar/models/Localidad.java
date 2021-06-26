package frgp.utn.edu.ar.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOCALIDAD")
public class Localidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int cp;
	private String localidad;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="provincia_c")
	private Provincia provincia;
	private Boolean activo;
	
	
	public Localidad() {
		// TODO Auto-generated constructor stub
	}
	
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public Localidad(int cp, String localidad, Provincia provincia) {
		 this.cp = cp;
		 this.localidad = localidad;
		 this.provincia = provincia;
		 this.activo = true;
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



	@Override
	public String toString() {
		return "Localidad [CP=" + cp + ", Localidad=" + localidad + "]";
	}
}
