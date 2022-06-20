package com.damian.api.rest.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.api.rest.desafio.entity.Grupo;
import com.damian.api.rest.desafio.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	@Query(value = "select * from usuarios where username like %?1%", nativeQuery = true)
	public Iterable<Usuario> findByUsername(String username);
	
	@Query("select u.grupos from Usuario u where u.username=?1")
	public List<Grupo> findGroupByUsername(String username);
	
}
