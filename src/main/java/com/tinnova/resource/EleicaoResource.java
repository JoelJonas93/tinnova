package com.tinnova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinnova.model.Eleicao;
import com.tinnova.repository.EleicaoRepository;
import com.tinnova.services.CalculoVotosService;

@RestController
@RequestMapping("/eleicao")
public class EleicaoResource {
	
	@Autowired
	private EleicaoRepository eleicaoRepo;
	
	@Autowired
	private CalculoVotosService calculoVotosService;
	
	@GetMapping("/validos/{id}")
	public Double getPercentualValidos(@PathVariable Long id) {
		Eleicao eleicaoSalvo = eleicaoRepo.findById(id).get();
		return calculoVotosService.getPercentualVotosValidos(eleicaoSalvo);
	}
	
	@GetMapping("/brancos/{id}")
	public Double getPercentualBrancos(@PathVariable Long id) {
		Eleicao eleicaoSalvo = eleicaoRepo.findById(id).get();
		return calculoVotosService.getPercentualVotosBrancos(eleicaoSalvo);
	}
	
	@GetMapping("/nulos/{id}")
	public Double getPercentualNulos(@PathVariable Long id) {
		Eleicao eleicaoSalvo = eleicaoRepo.findById(id).get();
		return calculoVotosService.getPercentualVotosNulos(eleicaoSalvo);
	}
}
