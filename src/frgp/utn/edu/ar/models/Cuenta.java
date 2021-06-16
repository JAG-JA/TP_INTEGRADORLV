package frgp.utn.edu.ar.models;

import java.util.Date;

public class Cuenta {

	
	private int IdCuenta;
	private String codigo;
	private String descripcion;
	private String Cbu;
	private double Saldo;
	private String NroCuenta;
	private String NombreCuenta;
	private Date FechaAlta;
	private Boolean Activo;
	private TipoCuenta TipoCuenta;

	public int getId() {
		return IdCuenta;
	}

	public void setId(int id) {
		IdCuenta = id;
	}

	public TipoCuenta getTipoCuenta() {
		return TipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		TipoCuenta = tipoCuenta;
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
		return Cbu;
	}

	public void setCbu(String cbu) {
		Cbu = cbu;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String getNroCuenta() {
		return NroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		NroCuenta = nroCuenta;
	}

	public String getNombre() {
		return NombreCuenta;
	}

	public void setNombre(String nombre) {
		NombreCuenta = nombre;
	}

	public Date getFechaCreacion() {
		return FechaAlta;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		FechaAlta = fechaCreacion;
	}
	
	public Boolean getActivo() {
		return Activo;
	}

	public void setActivo(Boolean activo) {
		Activo = activo;
	}

	
}

