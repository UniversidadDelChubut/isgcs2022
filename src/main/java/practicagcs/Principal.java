package practicagcs;

import java.net.URL;
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
		
		URL url = Principal.class.getResource("total_titulares_por_periodo.csv");
		
		List<Entrada> entradas = l.getEntradas("isgcs2022/resources/total_titulares_por_periodo.csv", 
												"provincia", 
												"municipio_id") ; // Obtenerla de la clase Lector
		
		
		// Persistir las salidas en la base de datos con la clase Escritor
		

		
		
		
		logger.info("Finaliza main!");
		logger.info("Chau!");
	}

}
