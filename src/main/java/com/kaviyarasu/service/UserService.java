package com.kaviyarasu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaviyarasu.model.User;
import com.kaviyarasu.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public User findByUserNameAndPassword(String user_name, String password){
		return userRepository.findByUserNmaeAndPassword(user_name, password, "admin");
		
	}

	public User register(User user) {
		return userRepository.save(user);
		
	}

}
