package com.example.demo.service;


import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entity.*;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	List<Student> findByKeyword(String keyword);
	
	Page<Student> findPaginated(int pageNo, int pageSize,String sortField, String sortDirection);

	


	
	
	
}
