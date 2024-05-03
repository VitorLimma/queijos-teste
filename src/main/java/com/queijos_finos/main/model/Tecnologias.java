package com.queijos_finos.main.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Tecnologias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nome;
	private String observacao;
	
	
	@ManyToMany(mappedBy = "tecnologias")
	private List<Propriedade> propriedades;
	
	
	public List<Propriedade> getPropriedades() {
		return propriedades;
	}
	public void setPropriedades(List<Propriedade> propriedades) {
		this.propriedades = propriedades;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, nome, observacao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tecnologias other = (Tecnologias) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(nome, other.nome)
				&& Objects.equals(observacao, other.observacao);
	}
}
