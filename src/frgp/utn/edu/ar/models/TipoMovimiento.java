package frgp.utn.edu.ar.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPOMOVIMIENTO")
public class TipoMovimiento {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idTipoMovimiento;
		private String movimiento;
		private Boolean activo;
		private String codigo;

		public TipoMovimiento()
		{
			
		}

		public String getMovimiento() {
			return movimiento;
		}
		
		public int getIdTipoMovimiento() {
			return idTipoMovimiento;
		}

		public void setMovimiento(String movimiento) {
			this.movimiento = movimiento;
		}

		public Boolean getActivo() {
			return activo;
		}
		
		public void setActivo(Boolean activo) {
			this.activo = activo;
		}
		
		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
		@Override
		public String toString() {
			return "TipoMovimiento [Movimiento=" + movimiento + "]";
		}
		
		
		

}
