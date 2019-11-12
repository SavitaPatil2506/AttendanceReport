package com.example.demo.entity;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name="savitaastudent")
@NoArgsConstructor
@AllArgsConstructor

public class Student {
	@Id
	private long id;
	private String studentName;
	private String address;
	private LocalDate dob;
    private long mobileNumber;
	
	
	

}
