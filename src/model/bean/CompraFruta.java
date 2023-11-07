package model.bean;

public class CompraFruta {

	private int id;
	private String cpf;
	private Double valorTotal;
	private Integer quantidadeComprada;
	private boolean compraFinalizada;
	
	public CompraFruta() {
		super();
	}

	public CompraFruta(String cpf, Double valorTotal, Integer quantidadeComprada, boolean compraFinalizada) {
		this.cpf = cpf;
		this.valorTotal = valorTotal;
		this.quantidadeComprada = quantidadeComprada;
		this.compraFinalizada = compraFinalizada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(Integer quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public boolean getCompraFinalizada() {
		return compraFinalizada;
	}

	public void setCompraFinalizada(boolean compraFinalizada) {
		this.compraFinalizada = compraFinalizada;
	}
	
	public void finalizar() {
		setCompraFinalizada(true);
	}
	
	public void atualizarQuantidade(Integer quantidade) {
		setQuantidadeComprada(this.quantidadeComprada + quantidade);
	}
	
	public void atualizarValorTotal(Double valor) {
		setValorTotal(this.valorTotal + valor);
	}

	@Override
	public String toString() {
		return "CompraFruta [id=" + id + ", cpf=" + cpf + ", valorTotal=" + valorTotal + ", quantidadeComprada="
				+ quantidadeComprada + ", compraFinalizada=" + compraFinalizada + "]";
	}
}
