package com.university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.entities.Esami;
import com.university.services.EsamiService;

@RestController
@RequestMapping(path="/esami")
public class EsamiController {
	@Autowired
	EsamiService esser;
	@PostMapping(path="/add")
	public @ResponseBody String addEsame(@RequestBody Esami e) {
		return(esser.addEsami(e));
	}
	@GetMapping(path="/getAll")
	public @ResponseBody Iterable<Esami> getAllEsami() {
		return(esser.allEsami());
	}

}
