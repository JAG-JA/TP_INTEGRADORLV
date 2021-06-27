package frgp.utn.edu.ar.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MOVIMIENTO")
public class Movimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMovimiento;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tipoMovimiento_c")
	private TipoMovimiento tipoMovimiento;
	private Date fechaAlta;
	private String detalleMovimiento;
	private Double importe;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cuenta_c")
	private Cuenta cuenta;

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
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
