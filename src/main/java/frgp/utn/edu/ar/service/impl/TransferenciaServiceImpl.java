package frgp.utn.edu.ar.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.dao.TipoMovimientoDao;
import frgp.utn.edu.ar.dao.MovimientoDao;
import frgp.utn.edu.ar.dao.TransferenciaDao;
import frgp.utn.edu.ar.dto.TransferenciaDto;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Movimiento;
import frgp.utn.edu.ar.models.TipoMovimiento;
import frgp.utn.edu.ar.models.Transferencia;
import frgp.utn.edu.ar.service.TransferenciaService;

@Service
public class TransferenciaServiceImpl implements TransferenciaService{

	@Autowired
	private TransferenciaDao transferenciaDao;

	@Autowired
	private TipoMovimientoDao tipoMovimientoDao;
	
	@Autowired
	private CuentaDao cuentaDao;
	
	@Autowired
	private MovimientoDao movimientoDao;
	
	@Override
	public Transferencia findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transferencia> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transferencia findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transferencia save(Transferencia transferencia) {
		//actualizar fecha,guardar trx, guardar movimientos, generar 2 movimientos
		transferencia.setFecha(new Date());
		transferencia.setNroTransferencia(9999); //Ver
		
		Movimiento movimientoOrigen = new Movimiento();
		Movimiento movimientoDestino = new Movimiento();
		TipoMovimiento tipoMovimientoOrig = new TipoMovimiento();
		TipoMovimiento tipoMovimientoDest = new TipoMovimiento();
		Cuenta cuentaOrig = new Cuenta();
		Cuenta cuentaDest = new Cuenta();
		
		//2 egreso		
		tipoMovimientoOrig = tipoMovimientoDao.findTipoMovimientoById(2);
		cuentaOrig = cuentaDao.findById((long) transferencia.getMovimientoOrigen().getCuenta().getIdCuenta());
		
		movimientoOrigen.setDetalleMovimiento("Movimiento de tipo transferencia a cuenta origen");
		movimientoOrigen.setImporte(transferencia.getMovimientoDestino().getImporte()*-1);
		movimientoOrigen.setFechaAlta(transferencia.getFecha());
		movimientoOrigen.setTipoMovimiento(tipoMovimientoOrig);
		movimientoOrigen.setCuenta(cuentaOrig);
		
		//1 ingreso
		tipoMovimientoDest = tipoMovimientoDao.findTipoMovimientoById(1);		
		cuentaDest = cuentaDao.findById((long) transferencia.getMovimientoDestino().getCuenta().getIdCuenta());

		movimientoDestino.setDetalleMovimiento("Movimiento de tipo transferencia a cuenta destino");
		movimientoDestino.setImporte(transferencia.getMovimientoDestino().getImporte());
		movimientoDestino.setFechaAlta(transferencia.getFecha());
		movimientoDestino.setTipoMovimiento(tipoMovimientoDest);
		movimientoDestino.setCuenta(cuentaDest);
				
		return transferenciaDao.save(transferencia);
	}

	
//	@Override
//	public Transferencia save(Transferencia transferencia) {
//		//actualizar fecha,guardar trx, guardar movimientos, generar 2 movimientos
//		transferencia.setFecha(new Date());
//		transferencia.setNroTransferencia(9999); //Ver
//		
//		Movimiento movimientoOrigen = new Movimiento();
//		Movimiento movimientoDestino = new Movimiento();
//		TipoMovimiento tipoMovimientoOrig = new TipoMovimiento();
//		TipoMovimiento tipoMovimientoDest = new TipoMovimiento();
//		Cuenta cuentaOrig = new Cuenta();
//		Cuenta cuentaDest = new Cuenta();
//		
//		//2 egreso		
//		tipoMovimientoOrig = tipoMovimientoDao.findTipoMovimientoById(2);
//		cuentaOrig = cuentaDao.findById((long) transferencia.getMovimientoOrigen().getCuenta().getIdCuenta());
//		
//		movimientoOrigen.setDetalleMovimiento("Movimiento de tipo transferencia a cuenta origen");
//		movimientoOrigen.setImporte(transferencia.getMovimientoDestino().getImporte()*-1);
//		movimientoOrigen.setFechaAlta(transferencia.getFecha());
//		movimientoOrigen.setTipoMovimiento(tipoMovimientoOrig);
//		movimientoOrigen.setCuenta(cuentaOrig);
//		
//		//1 ingreso
//		tipoMovimientoDest = tipoMovimientoDao.findTipoMovimientoById(1);		
//		cuentaDest = cuentaDao.findById((long) transferencia.getMovimientoDestino().getCuenta().getIdCuenta());
//
//		movimientoDestino.setDetalleMovimiento("Movimiento de tipo transferencia a cuenta destino");
//		movimientoDestino.setImporte(transferencia.getMovimientoDestino().getImporte());
//		movimientoDestino.setFechaAlta(transferencia.getFecha());
//		movimientoDestino.setTipoMovimiento(tipoMovimientoDest);
//		movimientoDestino.setCuenta(cuentaDest);
//				
//		return transferenciaDao.save(transferencia);
//	}

	@Override
	public void save(TransferenciaDto dto) {
	   Transferencia sTranferencia = new Transferencia();
	   sTranferencia.setDetalle(dto.getDetalle());
	   sTranferencia.setFecha(new Date() );

	   Movimiento sMDestino = new Movimiento();
	   //sMDestino.setIdMovimiento(9991);
	   sMDestino.setFechaAlta(new Date());
	   sMDestino.setTipoMovimiento(tipoMovimientoDao.findTipoMovimientoById(1));
	   sMDestino.setCuenta(cuentaDao.findByName(dto.getCuentaDestino()));
	   sMDestino.setImporte(Double.parseDouble(dto.getImporte()));
	   
//	   Movimiento sMOrigen = new Movimiento();
//	   sMOrigen.setFechaAlta(new Date());
//	   sMOrigen.setIdMovimiento(1);
//	   sMOrigen.setCuenta(cuentaDao.findByName(dto.getCuentaOrigen()));
//	
//	   sMOrigen.setImporte(Double.parseDouble(dto.getImporte()));
	   
	   
	  // sTranferencia.setMovimientoDestino(sMDestino);
	  // sTranferencia.setMovimientoOrigen(sMOrigen);
	   
	   //se recupera el id para luego actulizar la transferencia con el id del segundo momvimieto
	  Integer idTransferencia = transferenciaDao.saveT(sTranferencia);
	  // guardar el segundo movimiento
	   
	  
	   Movimiento sMOrigen = new Movimiento();
	   sMOrigen.setFechaAlta(new Date());
	   //sMOrigen.setIdMovimiento(8881);
	   sMOrigen.setTipoMovimiento(tipoMovimientoDao.findTipoMovimientoById(2));
	   sMOrigen.setCuenta(cuentaDao.findByName(dto.getCuentaOrigen()));
	   sMOrigen.setImporte(Double.parseDouble(dto.getImporte())*-1);
	   
	   Integer idMovimeintoOrigen = movimientoDao.saveM(sMOrigen);
	   Integer idMovimeintoDestino= movimientoDao.saveM(sMDestino);
	   transferenciaDao.update(idTransferencia, idMovimeintoOrigen,idMovimeintoDestino);
	   
	   // up de la cuenta restando el saldo.
	   // la validacion del monto
	   // sMOrigen.setIdMovimiento(1);  agregar el verdadero tipo de moviento.
	}

	@Override
	public void delete(Transferencia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
