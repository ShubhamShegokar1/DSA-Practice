import javax.persistence.EntityManager;

import com.masai.app.beans.Course;
import com.masai.app.beans.Student;
import com.masai.app.utility.DBUtil;

public class Main {
	public static void main(String[] args) 
	{
		EntityManager em = DBUtil.getConnection();
		
		Student student = new Student(1,"shgs",100);
		Course course = new Course(101,"jsb");

		student.setCourse(course);
		course.setStudent(student);

		
		em.getTransaction().begin();
		em.persist(course);
		em.persist(student);
		
		/*
		Course course2=em.find(Course.class, 101);
		em.getTransaction().commit();
		em.close();
		System.out.println(course2.toString());
		*/
		
		em.getTransaction().commit();
		em.close();
	}
}
