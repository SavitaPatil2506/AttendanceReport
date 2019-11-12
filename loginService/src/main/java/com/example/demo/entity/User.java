package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="savitauser")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private long id;
	private String userName;
	private long passWord;
	private String userType;
	
	

}
