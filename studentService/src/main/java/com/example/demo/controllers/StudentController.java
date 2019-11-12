package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	
	@PostMapping(path="/students",produces="application/json")
	public Student addStudent (@RequestBody Student student){
		
		return this.service.add(student);
	}
	
	
	
	@GetMapping(path="/students")
	public List<Student> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/students/{mobileNumber}")
		
	
	public Student findById(@PathVariable("mobileNumber")long mobileNumber) {
		
		Student found=null;
		Optional <Student> response=this.service.findById(mobileNumber);
		
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}
	
	
	@DeleteMapping(path="/students/{id}")
	public Student deleteById(@PathVariable("id")long id) {
		return this.service.deleteById(id);
	}
	
	
	

}
		
	
	
	
	


