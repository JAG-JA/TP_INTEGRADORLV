package frgp.utn.edu.ar.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CUENTA")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCuenta;
	private String codigo;
	private String descripcion;
	private String cbu;
	private double saldo;
	private String nroCuenta;
	private String nombreCuenta;
	private Date fechaAlta;
	private Boolean activo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tipoCuenta_c")
	private TipoCuenta tipoCuenta;
	
		
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return idCuenta;
	}

	public void setId(int id) {
		idCuenta = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public String getNombre() {
		return nombreCuenta;
	}

	public void setNombre(String nombre) {
		this.nombreCuenta = nombre;
	}

	public Date getFechaCreacion() {
		return fechaAlta;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaAlta = fechaCreacion;
	}
	
	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	
}

