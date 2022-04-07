package com.example.demoexample.HelloWorld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoexample.HelloWorld.entity.Users;
import com.example.demoexample.HelloWorld.repository.UserRepository;

@Service
public class User_Service_Impl implements User_Service {
	
	@Autowired
	private UserRepository repo ;

	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public List<Users> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	
	
	

}
