package com.example.demoexample.HelloWorld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoexample.HelloWorld.entity.Users;

public interface UserRepository extends  JpaRepository<Users, Integer> {

}
