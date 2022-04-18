package com.example.demo.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entity.*;


public interface StudentRepository extends JpaRepository<Student, Long>{
	
	@Query(value="SELECT s FROM students student WHERE student.firstName like %:keyword% or student.lastName like %:keyword% or student.email like %:keyword%",nativeQuery=true)
	
	public List<Student> findByKeyword(@Param ("keyword") String keyword);

}

	


