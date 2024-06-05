package com.example.vera.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produtos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	
	public Produtos(String nome,String descricao) {
		super();
		this.nome=nome;
		this.descricao=descricao;		
	}
	public String getDescricao() {
		return descricao;
	}public void setDescricao(String descricao) {
		this.descricao = descricao;
	}public int getId() {
		return id;
	}public String getNome() {
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}
}
