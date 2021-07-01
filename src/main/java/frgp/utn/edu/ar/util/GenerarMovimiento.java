package frgp.utn.edu.ar.util;

import java.util.Date;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Movimiento;
import frgp.utn.edu.ar.models.TipoMovimiento;

public class GenerarMovimiento {

	
    public static Movimiento  generarMovimiento(Double importe, Cuenta cuenta) {
		 
		Movimiento sMovimiento = new Movimiento();
	    sMovimiento=getMovimiento(importe, cuenta);

	    return sMovimiento;
		
	}
    
	public static Movimiento getMovimiento(Double importe, Cuenta cuenta) {
		TipoMovimiento sTipoMovimiento = new TipoMovimiento(importe>0?1:2,importe>0?"Ingreso":"Egreso");
		
		Movimiento sMovimiento = new Movimiento();
		sMovimiento.setFechaAlta(new Date());
		sMovimiento.setImporte(importe);
		sMovimiento.setTipoMovimiento(sTipoMovimiento);
		sMovimiento.setCuenta(cuenta);
		
		return sMovimiento;
	}
	
}
