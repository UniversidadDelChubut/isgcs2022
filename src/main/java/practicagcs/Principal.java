package practicagcs;

import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Principal {
	
	private static final Logger logger = LogManager.getLogger(Principal.class);
	
	private static class Salida {
		private String idProceso;
		private String campo;
		private Double total;
	}
	
	public static void main(String[] args) {
		logger.info("Inicia main!");
		
		Lector l = new Lector();
		
		List<Entrada> entradas = l.getEntradas("ACA VA EL PATH DONDE ESTE EL ARCHIVO", "provincia", "poblacion") ; // Obtenerla de la clase Lector
		
		
		
		List<Salida> salidas =  null; // Obtenerla de la clase Procesador a partir delas entradas leidas
		
		// Persistir las salidas en la base de datos con la clase Escritor
		

		logger.info("Finaliza main!");
	}

}
