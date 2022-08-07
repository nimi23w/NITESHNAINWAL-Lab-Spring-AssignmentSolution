package com.gls.studentMS.repository;

import java.util.List;

import com.gls.studentMS.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
