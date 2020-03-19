package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
	
	public static Connection getConnection() {
		Connection cn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection ("jdbc:mysql://localhost/bdparcial","root", "");
			System.out.println("Conectado...");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al conectar "+e);
		}
		return cn;
	}
}
