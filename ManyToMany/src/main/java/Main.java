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
		Course course = new Course(101,"Java");
		Course course1 = new Course(102,"Spring");
       student.getCourse().add(course1);
       student.getCourse().add(course);
        course.setStudent(student);    
        course1.setStudent(student);    

		em.getTransaction().begin();
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
