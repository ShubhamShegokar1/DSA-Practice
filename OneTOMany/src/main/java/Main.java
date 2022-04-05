import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.masai.app.beans.Course;
import com.masai.app.beans.Student;
import com.masai.app.utility.DBUtil;

public class Main {
	public static void main(String[] args) 
	{
		EntityManager em = DBUtil.getConnection();
		
		Student student = new Student(1,"Shubham",100);
		Student student1 = new Student(2,"Nihira",200);

		Course course = new Course(101,"Java");
		Course course1 = new Course(102,"Spring");
      
		student.getCourses().add(course1);
        student.getCourses().add(course);
        course.getStudents().add(student1);
        course.getStudents().add(student);

        
		em.getTransaction().begin();
		em.persist(course);
		em.persist(course1);
		em.persist(student);
		em.persist(student1);

		em.getTransaction().commit();
		em.close();
	}
}
