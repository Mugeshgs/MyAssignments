package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student name: Mugesh");
		
	}
	public void studentDept() {
		System.out.println("Student Department: CSE");
		
	}
	public void studentId() {
		System.out.println("Student ID: 1234");
	}
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
	}
}
