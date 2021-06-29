package frgp.utn.edu.ar.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import frgp.utn.edu.ar.models.Cliente;
import frgp.utn.edu.ar.models.Cuenta;
import frgp.utn.edu.ar.models.Localidad;
import frgp.utn.edu.ar.models.Provincia;
import frgp.utn.edu.ar.models.Rol;
import frgp.utn.edu.ar.models.Usuario;



public class GenerarCliente {

<<<<<<< HEAD
	public static Cliente  generarCliente() {
		 
=======
	public static Cliente  genearCliente() {
		
		//Genero registros de prueba
>>>>>>> 831e5310b44e6fae40fa5da336556c48982f7171
		Cliente sCliente = new Cliente();
		Rol sRol = new Rol(2, "Cliente");
	    String nombreApellido [] = 	NombresAleatorios.generarNombresAleatorios(1);
	    sCliente.setNombre(nombreApellido[0].split("-")[0]);
	    sCliente.setApellido(nombreApellido[0].split("-")[1]);
	    List<Cuenta> sListCuenta = new ArrayList<Cuenta>();
	    sListCuenta.add(getCuenta()); 
	    sCliente.setCuenta(sListCuenta);
	    sCliente.setLocalidad(new Localidad(1665,NombresAleatorios.generarNombresAleatoriosLoc(1)[0] , new Provincia(NombresAleatorios.generarNombresAleatoriosProvi(1)[0])));
	    sCliente.setUsuario(new Usuario(sCliente.getNombre() + "." + sCliente.getApellido(), "1234",sRol));
	    return sCliente;
		
	}

	public static List<Cuenta>  generarCuenta(Integer idCliente) {
		 
		List<Cuenta> sListCuenta = new ArrayList<Cuenta>();
	    sListCuenta.add(getCuenta()); 
	    return sListCuenta;
		
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