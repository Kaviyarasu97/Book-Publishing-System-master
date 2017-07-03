package com.kaviyarasu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kaviyarasu.model.User;
import com.kaviyarasu.service.UserService;

@Controller
@RequestMapping("Authentication")
public class AuthController {
	
	@Autowired
	public UserService userService;
	@GetMapping
	public String home(){
		return "login";
	}
	
	@GetMapping("/Login")
	public String login(@RequestParam("username") String userName,@RequestParam("password") String password){
		User user = userService.findByUserNameAndPassword(userName, password);
		System.out.println(user);
		if(user != null){
			return "redirect:../book/list";
			
			}
		else
			return "invalid username or password";
		
	}
	@GetMapping("/register")
	public String showRegsiter() {
		return "registration";
	}
	
	@GetMapping("/orders")
	public String showorderes() {
		return "orders";
	}

	@PostMapping("/register")
	public String register( @RequestParam("name") String name,
			@RequestParam("user_name")String user_name,
			@RequestParam("password")String password,
			@RequestParam("user_id")int user_id,
			@RequestParam("email")String email_id,
			@RequestParam("user_status")String user_status,
			@RequestParam("mobile_no")int mobile_no) {

			User user = new User(user_id, name, user_name, password, mobile_no, email_id, user_status);
			userService.register(user);
	
		return "redirect:../Authentication";		

	}
	

}
