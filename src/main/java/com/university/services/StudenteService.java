package com.university.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entities.Studente;
import com.university.repositories.EsamiRepository;
import com.university.repositories.StudentiRepository;

@Service
public class StudenteService {
	@Autowired
	StudentiRepository studrep;
	@Autowired
	EsamiRepository esrep;

	public String addStudente(Studente s) {
		Studente stu= new Studente();
		stu.setNome(s.getNome());
		stu.setCognome(s.getCognome());
		stu.setMatricola(s.getMatricola());
		studrep.save(stu);
		return "Studente inserito con successo";
	}
	public Iterable<Studente> allStudente(){
		return studrep.findAll();
	}
}
