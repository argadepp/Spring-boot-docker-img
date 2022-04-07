package com.example.demoexample.HelloWorld.service;

import java.util.List;

import com.example.demoexample.HelloWorld.entity.Users;

public interface User_Service  {
	
	public Users saveUser(Users user);
	
	public List<Users> getAllUser();
	
	

}
