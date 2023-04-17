package com.university.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Studente {
	String nome;
	String cognome;
	@Id
	String id;
	@OneToMany(mappedBy="studente")
	Set<VotoEsami> voti;
	
	public Studente() {}
	
	public Studente(String nome, String cognome, String matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.id = matricola;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getMatricola() {
		return id;
	}
	public void setMatricola(String matricola) {
		this.id = matricola;
	}
	public Set<VotoEsami> getEsami() {
		return voti;
	}
	public void setEsami(Set<VotoEsami> voti) {
		this.voti = voti;
	}
	

}
