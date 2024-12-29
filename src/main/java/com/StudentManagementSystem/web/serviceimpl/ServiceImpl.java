package com.StudentManagementSystem.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.web.entity.Student;
import com.StudentManagementSystem.web.repository.StudentRepository;
import com.StudentManagementSystem.web.service.StudentService;

@Service
public class ServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {

		List<Student> list = studentRepository.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void removeStudent(int id) {
		
		studentRepository.deleteById(id);
	}

}
