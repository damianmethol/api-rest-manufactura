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
@Table(name = "grupos", uniqueConstraints = { @UniqueConstraint(columnNames = { "grupo" }) })
public class Grupo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String grupo;

	@Column
	private String descripcion;

	public Grupo() {
		super();
	}

	public Grupo(String grupo, String descripcion) {
		super();
		this.grupo = grupo;
		this.descripcion = descripcion;
	}

	public Grupo(Long id, String grupo, String descripcion) {
		super();
		this.id = id;
		this.grupo = grupo;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, grupo, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(grupo, other.grupo)
				&& Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", grupo=" + grupo + ", descripcion=" + descripcion + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8148273664088900635L;

}
