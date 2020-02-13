package com.tinnova.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrdenaBubbleSortService {
	
	private int aux;
	private int i = 0;
	
	public int[] ordenarListaInt(int[] lista){
		for(i = 0; i < lista.length; i++) {
			for(int n = 0; n < (lista.length - 1); n++) {
				if(lista[n] > lista[n + 1]) {
					aux = lista[n];
					lista[n] = lista[n + 1];
					lista[n + 1] = aux;
				}
			}
			
		}
		return lista;
	}
}
