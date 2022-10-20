package practicagcs;

import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Principal {
	
	private static final Logger logger = LogManager.getLogger(Principal.class);
		
	public static void main(String[] args) {
		logger.info("Inicia main!");
		
		Lector l = new Lector();
		
		
		URL url = Principal.class.getResource("../pepe.txt");
		System.out.println("url : " + url);
		
		List<Entrada> entradas = l.getEntradas("ACA VA EL PATH DONDE ESTE EL ARCHIVO", "provincia", "poblacion") ; // Obtenerla de la clase Lector
	
		List <Salida>  salidas = new Procesador().procesar(entradas);
		
		
		for (Salida salida: salidas) {
			System.out.println(salida);
		}
		// Persistir las salidas en la base de datos con la clase Escritor
		

		
		
		
		logger.info("Finaliza main!");
		logger.info("Chau!");
	}

}
