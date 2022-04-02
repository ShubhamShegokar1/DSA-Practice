package app.dao.Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import app.JdbcConnection.JDBCConnection;
import app.dao.Interfaces.GraceMarks;

public class GraceMarksImp implements GraceMarks 
{
	@Override
	public int giveTheGraceMarks(int marks) 
	{
		int result = 0;
		try (Connection conn = JDBCConnection.getConnection()) 
		{
			PreparedStatement ps = conn.prepareStatement("update student set marks = marks + ?");
			ps.setInt(1, marks);
			result = ps.executeUpdate();
		} 
		catch (SQLException e) {}

		return result;
	}
}
