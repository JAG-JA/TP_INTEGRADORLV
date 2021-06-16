package frgp.utn.edu.ar.models;



public class TipoMovimiento {
	
		
		private int IdTipoMovimiento;
		private String movimiento;
		private Boolean Activo;
		private String Codigo;

		public TipoMovimiento()
		{
			
		}

		public String getMovimiento() {
			return movimiento;
		}
		
		public int getIdTipoMovimiento() {
			return IdTipoMovimiento;
		}

		public void setMovimiento(String movimiento) {
			this.movimiento = movimiento;
		}

		public Boolean getActivo() {
			return Activo;
		}
		public String getCodigo() {
			return Codigo;
		}

		public void setCodigo(String codigo) {
			this.Codigo = codigo;
		}
		
		public void setActivo(Boolean activo) {
			Activo = activo;
		}
		@Override
		public String toString() {
			return "TipoMovimiento [Movimiento=" + movimiento + "]";
		}
		
		
		

}
