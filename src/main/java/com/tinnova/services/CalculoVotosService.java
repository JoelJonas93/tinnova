package com.tinnova.services;

import org.springframework.stereotype.Service;

import com.tinnova.model.Eleicao;

@Service
public class CalculoVotosService {
	
	public Double getPercentualVotosValidos(Eleicao eleicao) {
		return getPercentual(eleicao.getVotosValidos(),eleicao);
	}
	
	public Double getPercentualVotosBrancos(Eleicao eleicao) {
		return getPercentual(eleicao.getVotosBrancos(),eleicao);
	}
	
	public Double getPercentualVotosNulos(Eleicao eleicao) {
		return getPercentual(eleicao.getVotosNulos(),eleicao);
	}
	
	public Double getPercentual(int votos,Eleicao eleicao) {
		return (double) ((votos / eleicao.getTotalEleitores()) * 100);
	}
	
}
