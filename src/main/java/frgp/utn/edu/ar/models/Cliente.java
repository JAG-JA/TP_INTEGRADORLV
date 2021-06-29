package frgp.utn.edu.ar.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="CLIENTE")
public class Cliente {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	private String nombre;
	private String apellido;
	private int dni;
	private String sexo;
	private String nacionalidad;
	private Date fechaNacimiento;
	private String direccion;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="localidad_c")
	private Localidad localidad;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="usuario_c")
	private Usuario usuario;
	private Boolean activo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cuenta_c")
	private List<Cuenta> cuentaList = new ArrayList<Cuenta>();
	
	public Cliente(){}

	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
//	public Provincia getProvincia() {
//		return provincia;
//	}
//	public void setProvincia(Provincia provincia) {
//		this.provincia = provincia;
//	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Cuenta> getCuenta() {
		return cuentaList;
	}
	public void setCuenta(List<Cuenta> cuentaList) {
		this.cuentaList = cuentaList;
	}


	public Boolean getActivo() {
		return activo;
	}


	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
}
