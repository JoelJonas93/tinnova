package com.tinnova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinnova.services.FatorialService;

@RestController
@RequestMapping("/fatorial")
public class FatorialResource {
	
	@Autowired
	private FatorialService fatorialService;
	
	@GetMapping("/{numero}")
	public int fatorial(@PathVariable int numero) {
		return fatorialService.calculaFatorial(numero);
	}
	
}
