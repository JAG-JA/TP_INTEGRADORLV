package frgp.utn.edu.ar.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRANSFERENCIA")
public class Transferencia {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idTransferencia;
		private int nroTransferencia;
		private Date fecha;
		private String detalle;
		@OneToOne//(cascade = CascadeType.ALL)
		@JoinColumn(name="movimiento_origen")
		private Movimiento movimientoOrigen;
		@OneToOne//(cascade = CascadeType.ALL)
		@JoinColumn(name="movimiento_destino")
		private Movimiento movimientoDestino;

		public int getIdTransferencia() {
			return idTransferencia;
		}
		public void setIdTransferencia(int idTransferencia) {
			this.idTransferencia = idTransferencia;
		}
		public int getNroTransferencia() {
			return nroTransferencia;
		}
		public void setNroTransferencia(int nroTransferencia) {
			this.nroTransferencia = nroTransferencia;
		}
		public Date getFecha() {
			return fecha;
		}
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		public String getDetalle() {
			return detalle;
		}
		public void setDetalle(String detalle) {
			this.detalle = detalle;
		}

		public Movimiento getMovimientoOrigen() {
			return movimientoOrigen;
		}
		public void setMovimientoOrigen(Movimiento movimientoOrigen) {
			this.movimientoOrigen = movimientoOrigen;
		}
		public Movimiento getMovimientoDestino() {
			return movimientoDestino;
		}
		public void setMovimientoDestino(Movimiento movimientoDestino) {
			this.movimientoDestino = movimientoDestino;
		}
		
}
