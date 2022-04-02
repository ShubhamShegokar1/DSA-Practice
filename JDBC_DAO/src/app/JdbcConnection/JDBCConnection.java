package app.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static Connection  getConnection()
	{
        Connection con=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc");
		} 
		catch (ClassNotFoundException e) 
		{}
		
		String url="jdbc:mysql://localhost:3306/dummy";
		
		try 
		{
			con=DriverManager.getConnection(url,"root","start");
		} 
		catch (SQLException e) {
			
		}
		
		return con;
	}
}
