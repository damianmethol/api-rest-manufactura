package com.damian.api.rest.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.damian.api.rest.desafio.entity.Nivel;

@Repository
public interface NivelRepository extends CrudRepository<Nivel, Long> {
	
	
}
