package com.damian.api.rest.desafio.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damian.api.rest.desafio.entity.Grupo;
import com.damian.api.rest.desafio.entity.Usuario;
import com.damian.api.rest.desafio.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	@Override
	public Iterable<Usuario> getAllUsuarios() {
		return repository.findAll();
	}

	@Override
	public Iterable<Usuario> getUsuarioByUsername(String username) {
		return repository.findByUsername(username);
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		
		if(usuario.getCreateAt()==null) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime dateTime = LocalDateTime.now();
			String fechaFormateada = dateTime.format(formatter);
			usuario.setCreateAt(fechaFormateada);
		}
		usuario = repository.save(usuario);
		return usuario;
	}

	@Override
	public List<Grupo> findGroupByUsername(String username) {
		return repository.findGroupByUsername(username);
	}
	
}
