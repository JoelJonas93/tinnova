package com.tinnova.services;

import org.springframework.stereotype.Service;

@Service
public class FatorialService {
	public int calculaFatorial(int numero) {
		int fatorial = numero;
		while(numero > 1) {
			fatorial = fatorial * (numero - 1);
			numero--;
		}
		return fatorial;
	}
}
