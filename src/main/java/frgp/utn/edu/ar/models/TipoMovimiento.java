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

		
		@Override
		public String toString() {
			return "TipoMovimiento [Movimiento=" + movimiento + "]";
		}
		
		
		public TipoMovimiento(String descripcion) {
			this.movimiento = descripcion;
		}		
		
		public TipoMovimiento(int id,String descripcion) {
			this.idTipoMovimiento = id;
			this.movimiento = descripcion;
		}
		

}
