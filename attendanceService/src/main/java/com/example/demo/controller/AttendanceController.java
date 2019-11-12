package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Attendance;

import com.example.demo.service.AttendanceService;


@RestController
public class AttendanceController {

	
	

	@Autowired
	private AttendanceService service;
	
	
	
	@PostMapping(path="/attendance",produces="application/json")
	public Attendance addattendance (@RequestBody Attendance attendance){
		
		return this.service.add(attendance);
	}
	
	
	
	@GetMapping(path="/attendance")
	public List<Attendance> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/attendance/{id}")
		
	
	public Attendance findById(@PathVariable("id")long id) {
		
		Attendance found=null;
		Optional <Attendance> response=this.service.findById(id);
		
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}
	
     @GetMapping(path="/attendance/{id}/{month}")
	
	public List<Attendance> findByIdAndMonth(@PathVariable("id") long id,@PathVariable("month") long month){
		return this.service.findByIdAndMonth(id,month);
	}
	
}
