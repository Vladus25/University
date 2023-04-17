package com.university.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Esami {
	@Id
	String id;
	String materia;
	@OneToMany(mappedBy="esame")
	Set<VotoEsami> voti;
	
	public String getCodice() {
		return id;
	}
	public void setCodice(String codice) {
		this.id=codice;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public Set<VotoEsami> getVoti() {
		return voti;
	}
	public void setStudenti(Set<VotoEsami> voti) {
		this.voti = voti;
	}
}
