package com.damian.api.rest.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.damian.api.rest.desafio.entity.Usuario;
import com.damian.api.rest.desafio.service.UsuarioService;

@Controller
@RequestMapping("/user")
public class UsuarioController {

	@Autowired
	UsuarioService userService;
	
	@GetMapping({"/","","/lista"})
	public String lista(Model model){
		
		model.addAttribute("usuarios", (List<Usuario>) userService.getAllUsuarios());
		
		return "lista";
		
	}
	
	@GetMapping("/createUsuario")
	public String createUsuario(Model model) {
		
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("usuarios", (List<Usuario>) userService.getAllUsuarios());
		
		
		return "form";
	}
	
	@PostMapping("/createUsuario")
	public String createUsuario(Usuario usuario, Model model) {
		userService.createUsuario(usuario);
		model.addAttribute("users", (List<Usuario>) userService.getAllUsuarios());
		
		return "redirect:/user/lista";
	}
	
}
