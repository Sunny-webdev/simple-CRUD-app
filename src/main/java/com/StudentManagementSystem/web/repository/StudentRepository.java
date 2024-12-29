package com.StudentManagementSystem.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.web.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
