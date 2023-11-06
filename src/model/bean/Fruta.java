package model.bean;

import java.io.Serializable;

import javax.lang.model.element.QualifiedNameable;

public class Fruta implements Serializable{
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String nome;
	
	private Double valor;
	
	private int estoque;
	
	public Fruta() {
		super();
	}

	public Fruta(int id, String nome, Double valor, int estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	public Fruta(String nome, Double valor, int estoque) {
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Integer getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void atualizarEstoque(int quantidade) {
		setEstoque(getEstoque() - quantidade);
	}
	
	public Double getSubTotal(int quantidade) {
		return valor * quantidade;
	}
}
