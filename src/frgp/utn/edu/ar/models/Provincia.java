package frgp.utn.edu.ar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROVINCIA")
public class Provincia  {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvincia;
	private String provincia;
	private Boolean activo;
	

	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	public Provincia(String provincia) {
	   this.provincia = provincia;
		this.activo = true;
	}
	
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



}
