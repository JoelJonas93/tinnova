package com.tinnova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinnova.services.SomaMultiplosTresCincoService;

@RestController
@RequestMapping("/somamultiplostrescinco")
public class SomaMultiplos {
	@Autowired
	private SomaMultiplosTresCincoService somaMultiplos;
	
	@GetMapping("/{numero}")
	public int somaMultiplosTresCinco(@PathVariable int numero) {
		return somaMultiplos.somaMultiplosTresCinco(numero);
	}
}
