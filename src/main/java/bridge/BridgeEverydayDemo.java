package bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {

	public static void main(String args[]) {

		try {
			//JDBC is an API
			DriverManager.registerDriver(new org.h2.Driver()); // <- Driver

			Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/bridge", "sa", "");

			Statement sta = conn.createStatement(); 
			
			//This client is an abstraction and can work with any database that has a driver
			sta.executeUpdate("CREATE TABLE Address (ID INT, STREET_NAME VARCHAR(20), CITY VARCHAR(20))");
			
			System.out.println("Table created");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
