package com.damian.api.rest.desafio.service;

import java.util.List;


import com.damian.api.rest.desafio.entity.Grupo;
import com.damian.api.rest.desafio.entity.Usuario;

public interface UsuarioService {

	public Iterable<Usuario> getAllUsuarios();
	
	public Iterable<Usuario> getUsuarioByUsername(String username);
	
	public Usuario createUsuario(Usuario user);
	
	public List<Grupo> findGroupByUsername(String username);
}
