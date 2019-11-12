package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendance;

import com.example.demo.repos.AttendanceRepository;




@Service
public class AttendanceService {

	
	@Autowired
	private  AttendanceRepository repo;
	
	public Attendance add( Attendance  attendance) {
		return this.repo.save(attendance);
	}
	
	public List <Attendance>findAll(){
		return this.repo.findAll();
	}
	
	public  Optional<Attendance> findById(long id){
		return this.repo.findById(id);
	}
	
	public List<Attendance>findByIdAndMonth(long id,long month){
		return this.repo.findByIdAndMonth(id,month);
	}
}
