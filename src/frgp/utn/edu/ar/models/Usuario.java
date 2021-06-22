package frgp.utn.edu.ar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String userName;
	private String password;
	private Long rol;

	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getRol() {
		return rol;
	}
	public void setRol(Long rol) {
		this.rol = rol;
	}
	
	public Usuario()
	{
		
	}
	public Usuario(String usr, String pass)
	{
		 this.userName = usr;
		 this.password = pass;
	}
	public Usuario(String usr, String pass,Long idRol)
	{
		 this.userName = usr;
		 this.password = pass;
		 this.rol = idRol;
	}
}
