package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="savitaattendance")
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {
	
	@Id
	private long id;
	private long rollNumber;
	private String day;
	private long month;
	private long year;

}
