package com.university.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class VotoEsami {
	@EmbeddedId
	StudenteEsamiKey id= new StudenteEsamiKey();
	@ManyToOne
	@MapsId("studenteId")
	@JoinColumn(name= "studente_id")
	Studente studente;
    @ManyToOne
    @MapsId("esamiId")
    @JoinColumn(name="esame_id")
    Esami esame;
    
    Integer voto;

	public StudenteEsamiKey getId() {
		return id;
	}

	public void setId(StudenteEsamiKey id) {
		this.id = id;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Esami getEsame() {
		return esame;
	}

	public void setEsame(Esami esame) {
		this.esame = esame;
	}

	public Integer getVoto() {
		return voto;
	}

	public void setVoto(Integer voto) {
		this.voto = voto;
	}
    
}
