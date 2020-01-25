package com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.modal.User;
import com.example.repositry.UserRepositry;

@Service
@Transactional
public class UserService {
	
	 @Autowired
	private UserRepositry userRepositry;
	/*
	public UserService(UserRepositry userRepositry) {
		this.userRepositry = userRepositry;
	}
	*/
	
	public void saveMyUser(User user)
	{
		userRepositry.save(user);
	}
	
	public List<User> showAllUsers()
	{
		List<User> users = new ArrayList<User>();
		for(User user:userRepositry.findAll())
		{
			users.add(user);
		}
		
		return users;
	}
	
	public void deleteMyUser(int id)
	{
		userRepositry.deleteById(id);
	}
	
	public User editUser(int id)
	{
	    return userRepositry.findById(id).orElse(null);
	}
	
	public User findByUsernameAndPassword(String username, String password)
	{
		return userRepositry.findByUsernameAndPassword(username, password);
	}

	
	

}
