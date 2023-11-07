/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

public class Cliente {
    
	private int id;
	private String nome;
	private String cpf;
	private String numero;
	private String endereco;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf, String numero, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.endereco = endereco;
	}

    public Cliente(int id, String nome, String cpf, String numero, String endereco) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.endereco = endereco;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", numero=" + numero + ", endereco=" + endereco
				+ "]";
	}
}