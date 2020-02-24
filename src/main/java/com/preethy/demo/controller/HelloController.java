package com.preethy.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public ResponseEntity<Person> sayHello(){
		Person spouse = new Person("A","B",null);
		Person me = new Person("Preethy", "Krishnamoorthy", spouse);
		return new ResponseEntity<>(me, HttpStatus.OK);
	}
	
}
