package dao.util;

import java.sql.*;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static ConnectionFactory instance = new ConnectionFactory();
	public static final String URL = "jdbc:mysql://localhost/gestion_produits";
	public static final String USER = "root";
	public static final String PASSWORD = "";
	public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"; 

	private ConnectionFactory() {   
		try {     
			Class.forName(DRIVER_CLASS);  
		} catch (ClassNotFoundException e) 
			{  e.printStackTrace();}
		}               
	private Connection createConnection() {           
		Connection connection = null;           
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);           
		} catch (SQLException e) {  
			System.out.println("ERROR: Unable to Connect to Database.");
			}  return connection;
		}                 
	public static Connection getConnection() {  
		return instance.createConnection();
		}
}