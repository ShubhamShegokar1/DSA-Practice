package app.dao.Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Beans.Student;
import app.JdbcConnection.JDBCConnection;
import app.dao.Interfaces.GetById;

public class GetByIdImp implements GetById 
{
	@Override
	public void getStudentDetails(int rol) 
	{  
		try(Connection con= JDBCConnection.getConnection())
		{
			PreparedStatement preparedStatement=con.prepareStatement("select * from student where rollNo =2;");
			ResultSet rs = preparedStatement.executeQuery();
			rs.next(); 

			int r= rs.getInt("rollNo");
			String n =rs.getString("name");
			int a= rs.getInt("marks");
			System.out.println(r);
			System.out.println(n);
			System.out.println(a);

		}
		catch(SQLException e) {
			System.out.println("Exception");
		};
	}

}
