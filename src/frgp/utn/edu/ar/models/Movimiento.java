package frgp.utn.edu.ar.models;

import java.sql.Date;

public class Movimiento {

	private int idMovimiento;
	private TipoMovimiento tipoMovimiento;
	private Date fechaAlta;
	private String detalleMovimiento;
	private Double importe;
	private Cuenta cuenta;

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}	

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getDetalleMovimiento() {
		return detalleMovimiento;
	}

	public void setDetalleMovimiento(String detalleMovimiento) {
		this.detalleMovimiento = detalleMovimiento;
	}



}
