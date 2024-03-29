package br.ucsal.lojinha.model;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private String descricao;
	private BigDecimal preco;
	
	
	public Produto(String nome, String descricao, BigDecimal preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Produto() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	@Override
	public String toString() {
		return this.nome;
	}

	
	
}
