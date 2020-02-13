package com.tinnova.services;

import org.springframework.stereotype.Service;

@Service
public class SomaMultiplosTresCincoService {
	
	private int soma = 0;
	
	public int somaMultiplosTresCinco(int numero) {
		
		while(numero > 1) {
			numero--;
			if(numero%3 == 0 || numero%5 == 0) {
				soma += numero;
			}
		}
		return soma;
	}
}
