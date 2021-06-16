package frgp.utn.edu.ar.models;

import java.sql.Date;

public class Movimiento {

	private int IdMovimiento;
	private TipoMovimiento tipoMovimiento;
	private Date FechaAlta;
	private String DetalleMovimiento;
	private Double Importe;
	private Cuenta Cuenta;

	public Double getImporte() {
		return Importe;
	}

	public void setImporte(Double importe) {
		Importe = importe;
	}

	public Cuenta getCuenta() {
		return Cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		Cuenta = cuenta;
	}

	public int getIdMovimiento() {
		return IdMovimiento;
	}	

	public void setIdMovimiento(int idMovimiento) {
		IdMovimiento = idMovimiento;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Date getFechaAlta() {
		return FechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		FechaAlta = fechaAlta;
	}

	public String getDetalleMovimiento() {
		return DetalleMovimiento;
	}

	public void setDetalleMovimiento(String detalleMovimiento) {
		DetalleMovimiento = detalleMovimiento;
	}



}
