package com.generationbsm.generationbsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm")
public class BsmController {
	
	@GetMapping
	public String bsm () {
		return "Mentalidades: Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência."
				+ "\nHabilidades: Trabalho em Equipe, Atenção aos Detalhes, Proatividade, Comunicação.";
		
		
		
	}

}
