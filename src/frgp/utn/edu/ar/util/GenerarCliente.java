package frgp.utn.edu.ar.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Localidad;
import frgp.utn.edu.ar.models.Provincia;
import frgp.utn.edu.ar.models.Usuario;



public class GenerarCliente {

	public static Cliente  genearCliente() {
		 
		Cliente sCliente = new Cliente();
	    String nombreApellido [] = 	NombresAleatorios.generarNombresAleatorios(1);
	    sCliente.setNombre(nombreApellido[0].split("-")[0]);
	    sCliente.setApellido(nombreApellido[0].split("-")[1]);
	    List<Cuenta> sListCuenta = new ArrayList<Cuenta>();
	    sListCuenta.add(getCuenta()); 
	    sCliente.setCuenta(sListCuenta);
	    sCliente.setLocalidad(new Localidad(1665,NombresAleatorios.generarNombresAleatoriosProv(1)[0] , new Provincia("BS AS")));
	    sCliente.setUsuario(new Usuario(sCliente.getNombre(), "1234",1L));
	    return sCliente;
		 
		
	}
	public static Cuenta getCuenta() {
		Cuenta sCuenta = new Cuenta();
		sCuenta.setActivo(true);
		sCuenta.setNroCuenta( "0" + (10000 + Math.random() * 99999));
		sCuenta.setCbu( "00000000000000000" + (10000 + Math.random() * 99999));
		sCuenta.setFechaCreacion(new Date());
		return sCuenta;
	}
	
}
