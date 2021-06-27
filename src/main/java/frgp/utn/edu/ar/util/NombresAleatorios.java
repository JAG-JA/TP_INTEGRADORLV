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


	
	
	
}
