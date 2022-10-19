package practicagcs;

import java.util.List;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Principal {
	
	private static final Logger logger = LogManager.getLogger(Principal.class);
	
	
	public static void main(String[] args) {
		logger.info("Inicia main!");
		
		List<Entrada> entradas =  new Lector().leerEntradas(); // Obtenerla de la clase Lector
		
		List<Salida> salidas =  Procesador.procesar(entradas); // Obtenerla de la clase Procesador a partir delas entradas leidas
		
		
		
		for (Salida s: salidas) {
			
			System.out.println(s);
			
		}
		// Persistir las salidas en la base de datos con la clase Escritor
		

		
		
		
		logger.info("Finaliza main!");
		logger.info("Chau!");
	}

}
