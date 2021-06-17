package frgp.utn.edu.ar.models;



public class TipoMovimiento {
	
		
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
