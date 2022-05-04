package org.student;

import org.department.Department;

public class Student extends Department { //Multilevel inheritance
	public void studentName() {
		System.out.println("The student name is Lakshanya");
	}
	public void studentDept() {
		System.out.println("The student department is CSE");
	}
	public void studentId() {
		System.out.println("The student ID is 12345");
	}
public static void main(String[] args) {
	//Creating object for student class
	Student student=new Student();
	//Calling first class methods
	System.out.println("First class - College");
	student.collegeName();
	student.collegeCode();
	student.collegeRank();
	System.out.println("******************************************");
	//Calling second class methods
	System.out.println("Second class - Department");
	student.deptName();
	System.out.println("******************************************");
	//Calling current class methods
	System.out.println("Current class - Student");
	student.studentName();
	student.studentDept();
	student.studentId();
	System.out.println("******************************************");
	
}
}
