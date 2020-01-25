package com.example.repositry;

import org.springframework.data.repository.CrudRepository;

import com.example.modal.User;

public interface UserRepositry extends CrudRepository<User, Integer> {

	public User findByUsernameAndPassword(String username, String password);
	
}
