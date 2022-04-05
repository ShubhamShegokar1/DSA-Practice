package com.masai.app.beans;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student 
{	
	@Id
	private int roll;
	private String name;
	private int marks;
	
	@ManyToMany (cascade=CascadeType.ALL, mappedBy="students" )
	List <Course> courses= new ArrayList<>();
	
	public Student() {}

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> course) {
		this.courses = course;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
