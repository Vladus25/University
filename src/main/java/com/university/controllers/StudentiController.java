package com.university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.entities.Studente;
import com.university.services.StudenteService;


@RestController
@RequestMapping(path="/studenti")
public class StudentiController {
	@Autowired
	StudenteService studser;
	@PostMapping(path="/add")
	public @ResponseBody String addStudente(@RequestBody Studente s) {
		return(studser.addStudente(s));
	}
	@GetMapping(path="/getall")
	public @ResponseBody Iterable<Studente> getAllStudenti() {
		return(studser.allStudente());
	}
	
	

}
