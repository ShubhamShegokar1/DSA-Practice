package app.dao.Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Beans.Student;
import app.JdbcConnection.JDBCConnection;
import app.dao.Interfaces.InsertRecord;

public class InsertRecordImplementation implements InsertRecord{

	@Override
	public String insertRecord(Student student) {
		
		String message="Not Inserted";

		try(Connection con= JDBCConnection.getConnection())
		{
			PreparedStatement preparedStatement=con.prepareStatement("insert into student values(?,?,?)");
			preparedStatement.setInt(1, student.getRoll());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setInt(3,student.getMarks());
			
			int x=preparedStatement.executeUpdate();
			if(x>0) message="Record is inserted";
	
		}
		catch(SQLException e) {};
		return message;
	}



}
