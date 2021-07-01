package frgp.utn.edu.ar.util;

public class NombresAleatorios {
	
	public static String[] generarNombresAleatorios(int cantidad) {
		String[] nombresAleatorios = new String[cantidad];

		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar"};
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva" };

		for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + "-"
					+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
		}
		return nombresAleatorios;
	}


	public static void imprimir(String[] nombresGenerados) {
		for (int i = 0; i < nombresGenerados.length; i++) {
			System.out.println(nombresGenerados[i]);
		}
	}
	
	public static String[] generarNombresAleatoriosLoc(int cantidad) {
		String[] nombresAleatorios = new String[cantidad];

		String[] localidades = { "José c Paz", "San Miguel", "Tortuguitas", "Pacheco","San Fernando","Pergamino","Salto","Bahia Blanca","Capitan Sarmiento","Coronel Suarez","Pilar"};
		

		for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = localidades[(int) (Math.floor(Math.random() * ((localidades.length - 1) - 0 + 1) + 0))];
		}
		return nombresAleatorios;
	}

	
	public static String[] generarNombresAleatoriosProvi(int cantidad) {
		String[] nombresAleatorios = new String[cantidad];

		String[] provincias = { "Córdoba", "Corrientes", "Santa Fe", "San Luis","Chaco","Mendoza","Salta","Formosa","Tucuman","Buenos Aires","Tierra del Fuego","Jujuy","San Juan","Chubut","Santa Cruz","La Pampa","Santiago del Estero"};
	
		for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = provincias[(int) (Math.floor(Math.random() * ((provincias.length - 1) - 0 + 1) + 0))];
		}
		return nombresAleatorios;
	}

	public static String[] generarNombresAleatoriosDir(int cantidad) {
		String[] nombresAleatorios = new String[cantidad];

		String[] domicilios = { "La Paz 1160", "Godoy 3400", "Bogota 1101", "Triunvirato 440","Tribulato 668","Alvear 1349","Illia 4049","Bahia Carmen 2000","Honduras 610","Salvador 1039"};
		

		for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = domicilios[(int) (Math.floor(Math.random() * ((domicilios.length - 1) - 0 + 1) + 0))];
		}
		return nombresAleatorios;
	}

	public static String[] generarDNIAleatorios(int cantidad) {
		String[] dniAleatorios = new String[cantidad];

		String[] dni = { "31635029", "31635055", "33623121", "41635029","19611010","30775011","10235112", "21635021", "30635021", "23623121", "42635022","29611044","20713017","18235987"};
		

		for (int i = 0; i < cantidad; i++) {
			dniAleatorios[i] = dni[(int) (Math.floor(Math.random() * ((dni.length - 1) - 0 + 1) + 0))];
		}
		return dniAleatorios;
	}
	
	
}
