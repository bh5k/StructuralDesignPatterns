package facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

	private static volatile DbSingleton instance = null;
	
	private Connection conn = null;
	
	private DbSingleton () {
		try {
			DriverManager.registerDriver(new org.h2.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized(DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		if(conn == null || conn.isClosed()) {
			synchronized (DbSingleton.class) {
				if(conn == null || conn.isClosed()) {
					try {
						String dbUrl = "jdbc:h2:mem:~/bridge";

						conn = DriverManager.getConnection(dbUrl, "sa", "");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}
}
