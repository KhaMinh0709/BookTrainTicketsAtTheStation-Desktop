package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance =new ConnectDB();
	public static ConnectDB getInstance() {
		return instance;
	}
	public void disconnect() {
		if(con != null) {
			try {
				con.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;databasename = Chau_Tauvexxx";
		String user  = "sa";
		String password = "123456";
		con = DriverManager.getConnection(url,user,password);
		return con;
	}
	
}
