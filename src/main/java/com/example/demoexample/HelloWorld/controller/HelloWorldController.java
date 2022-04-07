package com.example.demoexample.HelloWorld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoexample.HelloWorld.entity.Users;
import com.example.demoexample.HelloWorld.service.User_Service_Impl;

@RestController
public class HelloWorldController {
	
	@Autowired
	private User_Service_Impl service;
	
	@GetMapping("/")
	public String home()
	{
		return "Hello Wolrd!!";
	}
	
	@GetMapping("/getusers")
	public List<Users> getAllUsers()
	{
		return service.getAllUser();
	}
	
	@PostMapping("/saveuser")
	public Users saveUser(@RequestBody Users user)
	{
		return service.saveUser(user);
	}
	

}
