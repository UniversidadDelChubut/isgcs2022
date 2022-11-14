package practicagcs;

import java.util.List;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Principal {
	
	private static final Logger logger = LogManager.getLogger(Principal.class);
	
	private static class Entrada {
		private String campo;
		private Double valor;
	}
	
	private static class Salida {
		
		private String idProceso;
		private String campo;
		private Double total;
			
	}
	
	public static void main (String[] args) {
		
		logger.info("Inicia main!");
				
		Escritor e = new Escritor();
		
		//reemplazar usuario y contraseña por sus credenciales de postgres
		e.cargarDatos("usuario", "contraseña");
		//e.vaciarTabla("usuario", "contraseña");
			
		logger.info("Finaliza main!");		
		
	}

}
