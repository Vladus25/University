package com.university.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entities.Esami;
import com.university.entities.Studente;
import com.university.entities.VotoEsami;
import com.university.repositories.EsamiRepository;
import com.university.repositories.StudentiRepository;
import com.university.repositories.VotoEsamiRepository;

@Service
public class VotoEsamiService {
	@Autowired
	VotoEsamiRepository votoesrep;
	@Autowired
	StudentiRepository studrep;
	@Autowired
	EsamiRepository esrep;
	
	public String addVoto(String ids, String ide,Integer voto) {
		Esami e=esrep.findById(ide).get();
		Studente s=studrep.findById(ids).get();
		VotoEsami vs= new VotoEsami();
		if(voto>30) {
			return "Voto non valido";
		}
		else if(18<=voto&&voto<=30) {
			vs.setEsame(e);
			vs.setStudente(s);
			vs.setVoto(voto);
			votoesrep.save(vs);
			return"Voto inserito con successo  Esame passato"+"\n"+"Esame passato";
		}
		else {
			return "Esame fallito";
		}
		
	}

}
