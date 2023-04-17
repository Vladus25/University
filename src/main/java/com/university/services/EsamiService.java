package com.university.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entities.Esami;

import com.university.repositories.EsamiRepository;
import com.university.repositories.StudentiRepository;

@Service
public class EsamiService {
	@Autowired
	StudentiRepository studrep;
	@Autowired
	EsamiRepository esrep;

	public String addEsami(Esami e) {
		Esami es= new Esami();
		es.setCodice(e.getCodice());
		es.setMateria(e.getMateria());
		esrep.save(es);
		return "Esame inserito con successo";
	}
	public Iterable<Esami> allEsami(){
		return esrep.findAll();
	}

}
