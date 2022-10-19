package practicagcs;

import java.util.LinkedList;
import java.util.List;

public class Lector {
	
	public Lector() {
		
	}
	
	
	public List<Entrada> leerEntradas() {
		List<Entrada> entradas = new LinkedList<>();
		
		
		entradas.add(new Entrada("Chubur", 12.0));
		entradas.add(new Entrada("Chubut", 15.0));
		entradas.add(new Entrada("Chubut", 16.0));
		entradas.add(new Entrada("San Luis", 22.0));
		entradas.add(new Entrada("San Luis", 78.0));
		
		
		
		
		
		
		return entradas;
	}
	
}
