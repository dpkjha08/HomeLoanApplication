package com.homeloan.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeloan.app.model.Users;
import com.homeloan.app.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;


	public Users checkUser(String name,String password) {
		return repo.findUsersByUsernameAndPassword(name, password);
	}
	
	public Users findByUsername(String name) {
		return repo.findUsersByUsername(name);
	}
	
	public Users saveUser(Users user) {
		return repo.save(user);
	}
	
	public Users checkEmail(String email) {
		return repo.findUsersByEmail(email);
	}
	
	public Users checkPhoneNum(Long phone) {
		return repo.findUsersByPhone(phone);
	}
}
