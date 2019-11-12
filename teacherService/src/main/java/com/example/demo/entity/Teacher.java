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
@Table(name="savitaateacher")
@NoArgsConstructor
@AllArgsConstructor

public class Teacher {
	@Id
	private long id;
	private String teacherName;
	private String address;
    private long mobileNumber;

}
