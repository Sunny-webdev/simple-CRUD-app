package com.StudentManagementSystem.web.service;

import java.util.List;

import com.StudentManagementSystem.web.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student getStudentById(int id);
	public void removeStudent(int id);
}
