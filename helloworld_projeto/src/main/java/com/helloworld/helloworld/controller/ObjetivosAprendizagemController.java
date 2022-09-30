package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-aprendizagem-controller")
public class ObjetivosAprendizagemController {
	
	@GetMapping
    public String MeusObejtivosdaSemana() {
    return "Meus objetivos para essa semana são: <br><br>"
            + "<br><li>Estudar logica de programacao<br><li>"
            + "<br><li>Praticar/Codar no Java<br><br>"
            + "<li>Organizar minha rotina semanal de estudos<br><li>"
            + "<br><li>Descansar<br><li>";
}
}	

	