package practicagcs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Procesador {

	public static List<Salida> procesar(List<Entrada> entradas) {
		
		Map<String, Double> m = new HashMap<>();
		
		String proceso = "";
		
		
		double valor = 0;
		for (Entrada entrada: entradas) {
			
			if (m.containsKey(entrada.getCampo())) {
				valor = m.get(entrada.getCampo());
			}
			valor += entrada.getValor();
			m.put(entrada.getCampo(), valor);
		}
		
		List<Salida> salidas = new LinkedList<>();
		
		for (String k: m.keySet()) {
			salidas.add(new Salida (proceso, k, m.get(k)));
		}
		
		
		return salidas;
	}
}
