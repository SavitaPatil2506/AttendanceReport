package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Attendance;


public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	public List<Attendance> findByIdAndMonth(long id,long month);

}
