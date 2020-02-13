package com.tinnova.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tinnova.services.OrdenaBubbleSortService;

@RestController
@RequestMapping("/ordenabubble")
public class OrdenaBubbleSortResource {
	@Autowired
	private OrdenaBubbleSortService ordena;
	
	@PostMapping
	public ResponseEntity<?> ordenaBubble(@RequestParam("lista") int[] lista){
		
		int[] listaOrdenada =  ordena.ordenarListaInt(lista);
		return ResponseEntity.status(HttpStatus.CREATED).body(listaOrdenada);
	}
}
