import Beans.Student;
import app.dao.Implementation.GetAllRecordsImp;
import app.dao.Implementation.GetByIdImp;
import app.dao.Implementation.GraceMarksImp;
import app.dao.Implementation.InsertRecordImplementation;
import app.dao.Interfaces.GetAllRecords;
import app.dao.Interfaces.GetById;
import app.dao.Interfaces.GraceMarks;
import app.dao.Interfaces.InsertRecord;

public class Main 
{
	public static void main(String[] args) 
	{
		/*
		InsertRecord studentDao=new InsertReASAcordImplementation();
		Student student = new Student(2,"Naresh",1000);
		System.out.println(studentDao.insertRecord(student));
		GetById getById= new GetByIdImp();
		getById.getStudentDetails(2);
		
	    GraceMarks graceMarks= new GraceMarksImp();
	    graceMarks.giveTheGraceMarks(3);
	    */
		
		GetAllRecords getAllRecords= new GetAllRecordsImp();
		getAllRecords.getAllRecords();
	}
}
