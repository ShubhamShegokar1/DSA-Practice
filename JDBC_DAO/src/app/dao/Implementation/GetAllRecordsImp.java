package app.dao.Implementation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.JdbcConnection;

import Beans.Student;
import app.JdbcConnection.JDBCConnection;
import app.dao.Interfaces.GetAllRecords;
public class GetAllRecordsImp implements GetAllRecords
{
	@Override
	public void getAllRecords() 
	{
	   	List <Student> list = new ArrayList<>();
	    try(Connection con =JDBCConnection.getConnection())
	    {
	    	PreparedStatement preparedStatement= con.prepareStatement("select * from student;");
	    	preparedStatement.executeQuery();
	    	ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
			{
				Student student= new Student();
				student.setRoll(rs.getInt("rollNo"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getInt("marks"));
				list.add(student);
			}
	    	System.out.println(list);
	    }
	    catch(Exception e) {}
          	   	
	}
}
