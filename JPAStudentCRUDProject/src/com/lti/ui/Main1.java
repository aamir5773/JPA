package com.lti.ui;

import com.lti.model.Student;
import com.lti.service.StudentService;
import com.lti.service.StudentServiceImpl;

public class Main1 {
	
	private static StudentService service = null;
	static{
		service = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {

		Student student = new Student(7, "Raj", 70.5);
		boolean result = service.addStudent(student);
		if(result)
			System.out.println("Student is added");
		
		Student student2 = service.findStudentByRollNumber(student.getRollNumber());
		System.out.println(student2);
		
	}

}
