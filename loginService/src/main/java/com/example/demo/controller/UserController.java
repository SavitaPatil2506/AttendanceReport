package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	
	

	@Autowired
	private UserService service;
	
	
	
	@PostMapping(path="/users",produces="application/json")
	public User adduser (@RequestBody User user){
		
		return this.service.add(user);
	}
	
	
	
	@GetMapping(path="/users")
	public List<User> findAll(){
		return this.service.findAll();
	}
	
@GetMapping(path="/users/{id}")
		
	
	public User findById(@PathVariable("id")long id) {
		
		User found=null;
		Optional <User> response=this.service.findById(id);
		
		if(response.isPresent()) {
			found=response.get();
		}
		return found;
	}

public String authenticateUser(User user) {
	User authenticate=findById(user.getId());
	if(authenticate!=null) {
		
		if(user.getId()==authenticate.getId()&&user.getPassWord()==authenticate.getPassWord()&&user.getUserType()==authenticate.getUserType()){
			
			return "Login successful";
			
		}
		
	}

		return " login unsuccessful";
	
	
} 
	   
   
	
	
}
