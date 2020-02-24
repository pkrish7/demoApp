package com.preethy.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFriendController {

	@GetMapping("/friend")
	public ResponseEntity<Person> sayHello(){
		Person spouse = new Person("Radhika","Yakasiri",null);
		Person me = new Person("Gurumoorthy", "Raghupathy", spouse);
		return new ResponseEntity<>(me, HttpStatus.OK);
	}
	
}
