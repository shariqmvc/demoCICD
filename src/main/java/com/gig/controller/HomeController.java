package com.gig.controller;

import java.sql.Timestamp;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gig.entity.User;
@RestController
@RequestMapping("/api")
public class HomeController {

	/*
	 * @GetMapping("/users") public ResponseEntity<?> getAllUsers(){ return
	 * ResponseEntity.status(HttpStatus.OK).body(Arrays.asList( new
	 * User("1","A","","","","","",new Timestamp(System.currentTimeMillis()),null),
	 * new User("2","B","","","","","",new
	 * Timestamp(System.currentTimeMillis()),null), new
	 * User("3","C","","","","","",new Timestamp(System.currentTimeMillis()),null),
	 * new User("4","D","","","","","",new
	 * Timestamp(System.currentTimeMillis()),null), new
	 * User("65","E","","","","","",new Timestamp(System.currentTimeMillis()),null),
	 * new User("","F","","","","","",new
	 * Timestamp(System.currentTimeMillis()),null)
	 * 
	 * )); }
	 */
	
	@GetMapping("/users")
	 public ResponseEntity<?> getAllUsers(){
		 return ResponseEntity.status(HttpStatus.OK).body("Hi deployed first");
	 }
}
