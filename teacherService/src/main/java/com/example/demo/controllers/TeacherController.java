package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;


@RestController
public class TeacherController {

	
	@Autowired
	private TeacherService service;
	
	
	
	@PostMapping(path="/teachers",produces="application/json")
	public Teacher addteacher (@RequestBody Teacher teacher){
		
		return this.service.add(teacher);
	}
	
	
	
	@GetMapping(path="/teachers")
	public List<Teacher> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/teachers/{mobileNumber}")
		
	
	public Teacher findById(@PathVariable("mobileNumber")long mobileNumber) {
		
		Teacher found=null;
		Optional <Teacher> response=this.service.findById(mobileNumber);
		
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}
}
