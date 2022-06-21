package com.damian.api.rest.desafio.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column
	@NotBlank
	public String username;

	@Column
	@NotBlank
	public String pass;

	@Column(name = "create_at")
	public String createAt;

	@Column(name = "user_status")
	public Boolean userStatus;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "seguridad", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "lvl_id", columnDefinition = "int default 0"))
	public List<Nivel> niveles;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "seguridad", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "group_id", columnDefinition = "int default 0"))
	public List<Grupo> grupos;

	public Usuario() {
		super();
	}

	public Usuario(String username, String pass, String createAt, Boolean userStatus) {
		super();
		this.username = username;
		this.pass = pass;
		this.createAt = createAt;
		this.userStatus = userStatus;
	}

	public Usuario(String username, String pass, String createAt, Boolean userStatus, List<Nivel> niveles,
			List<Grupo> grupos) {
		super();
		this.username = username;
		this.pass = pass;
		this.createAt = createAt;
		this.userStatus = userStatus;
		this.niveles = niveles;
		this.grupos = grupos;
	}

	public Usuario(Long id, String username, String pass, String createAt, Boolean userStatus, List<Nivel> niveles,
			List<Grupo> grupos) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.createAt = createAt;
		this.userStatus = userStatus;
		this.niveles = niveles;
		this.grupos = grupos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	public Boolean getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Boolean userStatus) {
		this.userStatus = userStatus;
	}

	public List<Nivel> getNiveles() {
		return niveles;
	}

	public void setNiveles(List<Nivel> niveles) {
		this.niveles = niveles;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createAt, grupos, id, niveles, pass, userStatus, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(createAt, other.createAt) && Objects.equals(grupos, other.grupos)
				&& Objects.equals(id, other.id) && Objects.equals(niveles, other.niveles)
				&& Objects.equals(pass, other.pass) && Objects.equals(userStatus, other.userStatus)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", pass=" + pass + ", createAt=" + createAt
				+ ", userStatus=" + userStatus + ", niveles=" + niveles + ", grupos=" + grupos + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -874436470043974013L;

}
