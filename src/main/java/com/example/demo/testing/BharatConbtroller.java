package com.example.demo.testing;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BharatConbtroller {

	Coach coach;

	public BharatConbtroller(@Qualifier("cricketCoach") Coach coach) {
		this.coach = coach;
	}

	@GetMapping("/test/{id}")
	public ResponseEntity<String> traing(@PathVariable int id) {
		if (id > 5) {
			return new ResponseEntity<String>("Movie not found", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>(coach.traing(), HttpStatus.OK);

		}
		
		
	}

}
