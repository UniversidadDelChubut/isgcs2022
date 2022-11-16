package practicagcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Escritor {
	
	
	String url = "jdbc:postgresql://localhost:5432/ings";
	
	public Connection cargarDatos(String usuario, String pass, List<Salida> lista) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection(this.url,usuario, pass);
			Statement stmt = conn.createStatement();
			
			for (Salida s: lista) {
				
				String insert = "INSERT INTO salida VALUES('"+ s.getIdProceso() +"', '"+s.getCampo()+"', "+s.getTotal()+")";
			
				System.out.println("registro: "+ s.getIdProceso() +" agregado");
				
				stmt.executeUpdate(insert);
			}
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("error: en consulta o al conectarse a la base de datos");
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public void vaciarTabla(String usuario, String pass) {
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection(this.url,usuario, pass);
			Statement stmt = conn.createStatement();
			
			
			String delete = "delete from salida";
		
			System.out.println("datos de tabla eliminados!");
			
			stmt.executeUpdate(delete);
		
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("error: en consulta o al conectarse a la base de datos");
			e.printStackTrace();
		}
		
	}
	
}