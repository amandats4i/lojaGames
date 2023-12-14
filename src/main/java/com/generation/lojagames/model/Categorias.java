package com.generation.lojagames.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_categorias")

public class Categorias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank(message = "O Atributo Descrição é obrigatório")
	private String categorias;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorias", cascade = CascadeType.REMOVE) 
	@JsonIgnoreProperties("categorias")
	
	private List<Produtos>produtos;


	public List<Produtos> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCategorias() {
		return categorias;
	}


	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}
	
	
	
}
