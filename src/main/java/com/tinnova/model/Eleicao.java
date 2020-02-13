package com.tinnova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eleicao")
public class Eleicao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eleicao_id")
	private Long id;
	
	@Column(name = "totalEleitores")
	private int totalEleitores;
	
	@Column(name = "totalValidos")
	private int votosValidos;
	
	@Column(name = "totalBrancos")
	private int votosBrancos;
	
	@Column(name = "totalNulos")
	private int votosNulos;
	
	public Eleicao(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
		super();
		this.totalEleitores = totalEleitores;
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getTotalEleitores() {
		return totalEleitores;
	}
	public void setTotalEleitores(int totalEleitores) {
		this.totalEleitores = totalEleitores;
	}
	public int getVotosValidos() {
		return votosValidos;
	}
	public void setVotosValidos(int votosValidos) {
		this.votosValidos = votosValidos;
	}
	public int getVotosBrancos() {
		return votosBrancos;
	}
	public void setVotosBrancos(int votosBrancos) {
		this.votosBrancos = votosBrancos;
	}
	public int getVotosNulos() {
		return votosNulos;
	}
	public void setVotosNulos(int votosNulos) {
		this.votosNulos = votosNulos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + totalEleitores;
		result = prime * result + votosBrancos;
		result = prime * result + votosNulos;
		result = prime * result + votosValidos;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eleicao other = (Eleicao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (totalEleitores != other.totalEleitores)
			return false;
		if (votosBrancos != other.votosBrancos)
			return false;
		if (votosNulos != other.votosNulos)
			return false;
		if (votosValidos != other.votosValidos)
			return false;
		return true;
	}
	
	
}
