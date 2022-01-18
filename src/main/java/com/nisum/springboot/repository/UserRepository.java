package com.nisum.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.nisum.springboot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByEmail(String email);
	
	public User findById(String id);

	public User findByName(String name);
	
}
