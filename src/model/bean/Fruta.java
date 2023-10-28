package model.bean;

public class Fruta {

	private int id;
	private String nome;
	private Double valor;
	private int estoque;
	
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
}
