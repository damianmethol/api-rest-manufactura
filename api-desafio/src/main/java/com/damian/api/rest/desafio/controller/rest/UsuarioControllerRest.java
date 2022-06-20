package com.damian.api.rest.desafio.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damian.api.rest.desafio.entity.Grupo;
import com.damian.api.rest.desafio.entity.Usuario;
import com.damian.api.rest.desafio.service.UsuarioService;

@RestController
@RequestMapping("/user-rest")
public class UsuarioControllerRest {

	@Autowired
	UsuarioService userService;
	
	@GetMapping("/lista")
	public List<Usuario> lista(){
		return (List<Usuario>) userService.getAllUsuarios();
	}
	
	@GetMapping("/getUsuarioByUsername/{username}")
	public List<Usuario> getUsuarioByUsername(@PathVariable("username") String username){
		return (List<Usuario>) userService.getUsuarioByUsername(username);
	}
	
	@GetMapping("/getGroupByUsername/{username}")
	public List<Grupo> getGroupByUsername(@PathVariable("username") String username){
		return userService.findGroupByUsername(username);
	}
	
	@PostMapping("/createUsuario")
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return userService.createUsuario(usuario);
	}
	
	
}
