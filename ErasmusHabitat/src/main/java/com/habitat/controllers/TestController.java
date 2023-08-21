package com.habitat.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {
	@GetMapping("/checkapi")
	public ResponseEntity<String> checkGetApi(){
		return ResponseEntity.ok("API & GET end point it is running!");
	}
	@PostMapping("/checkapi")
	public ResponseEntity<String> checkPostApi(){
		return ResponseEntity.ok("API & POST end point it is running!");
	}
}
