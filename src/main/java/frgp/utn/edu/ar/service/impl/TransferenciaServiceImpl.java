package frgp.utn.edu.ar.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frgp.utn.edu.ar.dao.CuentaDao;
import frgp.utn.edu.ar.dao.TipoMovimientoDao;
import frgp.utn.edu.ar.dao.TransferenciaDao;
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

	@Override
	public void delete(Transferencia object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
