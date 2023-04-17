package com.university.repositories;



import org.springframework.data.repository.CrudRepository;

import com.university.entities.StudenteEsamiKey;
import com.university.entities.VotoEsami;


public interface VotoEsamiRepository extends CrudRepository<VotoEsami, StudenteEsamiKey>{
	
	VotoEsami findByStudente_idAndEsame_id(String studente_id, String esame_id);

}
