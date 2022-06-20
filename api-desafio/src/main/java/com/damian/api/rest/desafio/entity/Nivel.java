package com.damian.api.rest.desafio.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "niveles", uniqueConstraints = { @UniqueConstraint(columnNames = { "nivel" }) })
public class Nivel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nivel;

	public Nivel() {
		super();
	}

	public Nivel(String nivel) {
		super();
		this.nivel = nivel;
	}

	public Nivel(Long id, String nivel) {
		super();
		this.id = id;
		this.nivel = nivel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nivel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nivel other = (Nivel) obj;
		return Objects.equals(id, other.id) && Objects.equals(nivel, other.nivel);
	}

	@Override
	public String toString() {
		return "Nivel [id=" + id + ", nivel=" + nivel + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -800457678540219746L;

}
