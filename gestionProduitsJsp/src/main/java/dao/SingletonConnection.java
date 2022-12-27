package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver charge avec succes !");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_catal2","root","");
			//System.out.println("Connexion validee !");
		} catch (Exception e) {
			System.out.println("Problème de connexion");
		}
		
	}
	public static Connection getConnection(){
		return connection;
	}

}
