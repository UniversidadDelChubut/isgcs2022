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
		
		String file = "total_titulares_por_periodo.csv";
		URL url = Principal.class.getResource("../" + file);
		System.out.println("url : " + url);
		
		List<Entrada> entradas = l.getEntradas(file, "provincia", "titulares") ; // Obtenerla de la clase Lector

		for (Entrada entrada: entradas) {
			System.out.println(entrada);
		}

		
		List <Salida>  salidas = new Procesador().procesar(entradas);
/*
		
		
		List<Entrada> entradas = l.getEntradas("isgcs2022/resources/total_titulares_por_periodo.csv", 
												"provincia", 
												"municipio_id") ; // Obtenerla de la clase Lector
*/
		
		
		for (Salida salida: salidas) {
			System.out.println(salida);
		}
		// Persistir las salidas en la base de datos con la clase Escritor
		

		
		
		
		logger.info("Finaliza main!");
		logger.info("Chau!");
	}

}
