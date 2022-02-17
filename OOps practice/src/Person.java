import java.util.List;

/*

Implement a class for a “Person”. Person has data members ‘age’, ’weight’, ‘height’, ‘dateOfBirth’, 
‘address’ with proper reader/write methods etc. Now create two subclasses “Employee” and “Student”. 
Employee will have additional data member ‘salary’, ‘dateOfJoining’, ‘experience’ etc. Student has
 data members ‘roll’, ‘listOfSubjects’, their marks and methods ‘calculateGrade’. Again create two 
 sub-classes “Technician” and “Professor” from Employee. Professor has data members 
 ‘courses’, ‘listOfAdvisee’ and their add/remove methods. Write a main() function to demonstrate 
 the creation of objects of different classes and their method calls.*/


class Person
{
	int age, weight, height,DOB,address;
}


class Employee
{
	int salary,experience;
}

class Student
{
	int rollNo;
	List<Subject> list;
}

class Subject
{
	
}

