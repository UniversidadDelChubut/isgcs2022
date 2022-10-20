package practicagcs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class Lector {
	
	public static final String SEPARATOR = "#";
	
	public static final String QUOTE = "/";
	
	private static List<Entrada> entradas;
	
	
	public List<Entrada> getEntradas(String path, String campo1, String campo2) {
		
		BufferedReader br = null;
		
		try {
			
			 br =new BufferedReader(new FileReader(path));
	         
			 String line = "";
			 int posicionCampo1 = 0;
			 int posicionCampo2 = 0;
	         boolean posicion = false;
	         
			 while ((line = br.readLine())!=null) {
				 
				 if(posicion == false) {
					String[] cabecera = line.split(SEPARATOR);
					for (String s : cabecera) {
						for (int i = 0; i < cabecera.length; i++) {
							
							if (cabecera[i] == campo1) {
								posicionCampo1 = i;
							}
							
							if (cabecera[i] == campo2) {
								posicionCampo2 = i;
							}
						}
					}
					posicion = true;
				 } else {
				 
					String [] campos = line.split(SEPARATOR);
					entradas.add(new Entrada(campos[posicionCampo1], Double.parseDouble(campos[posicionCampo2])));
					 
				 }
	         }
	         
	         br.close();
	         
	      } catch (Exception e) {
	        System.out.println(e.getMessage());
	        e.printStackTrace();
	      }
		
		return entradas;
	
	}
}
