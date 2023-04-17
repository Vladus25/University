package com.university.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;


@Embeddable
public class StudenteEsamiKey implements Serializable{

	@Column(name="studente_id")
	private String studenteId;
	@Column(name="esami_id")
	private String esamiId;
	public String getStudenteId() {
		return studenteId;
	}
	public void setStudenteId(String studenteId) {
		this.studenteId = studenteId;
	}
	public String getEsamiId() {
		return esamiId;
	}
	public void setEsamiId(String esamiId) {
		this.esamiId=esamiId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(esamiId, studenteId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudenteEsamiKey other = (StudenteEsamiKey) obj;
		return Objects.equals(esamiId, other.esamiId) && Objects.equals(studenteId, other.studenteId);
	}

}
