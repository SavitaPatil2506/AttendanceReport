package com.example.demo.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Teacher;



public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	
public Optional <Teacher> findById(long id);
 

}
