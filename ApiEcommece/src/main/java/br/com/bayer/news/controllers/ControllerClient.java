package br.com.bayer.news.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClient {
	
	@GetMapping("/")
	public String hello() {
		return "Olá, Seja bem vindo(a)";
	}
	
	@GetMapping("/a")
	public void inserir() {
		System.out.print("Teste");
	}
}