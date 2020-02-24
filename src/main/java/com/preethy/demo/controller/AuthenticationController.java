package com.preethy.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.preethy.demo.jpamodel.UserDetails;

@RestController
public class AuthenticationController {
	
	@GetMapping("/authenticate")
	public ResponseEntity<UserDetails> login() {
		UserDetails userDetails = new UserDetails();
		userDetails.getUserid();
		System.out.println("USER ID ==> "+userDetails.getUserid());
		return new ResponseEntity<>(userDetails, HttpStatus.OK);
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello";
	}
}
