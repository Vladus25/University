package com.university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.university.services.VotoEsamiService;


@RestController
@RequestMapping(path="/voti")
public class VotoEsamiController {
	@Autowired
	VotoEsamiService votesser;
	@PostMapping(path="/add")
	public @ResponseBody String addVoto(@RequestParam(name="ids") String ids,@RequestParam(name="ide")  String ide,@RequestParam(name="voto")  Integer n) {
		return votesser.addVoto(ids, ide, n);
	}
}
