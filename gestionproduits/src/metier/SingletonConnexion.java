package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnexion {
	private static Connection connection;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_catal1","root","");
			//System.out.println("Creation d'une connexion !");
			//System.out.println("0 "+connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
