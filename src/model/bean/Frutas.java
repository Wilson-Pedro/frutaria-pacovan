/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

public class Frutas {
    private String codigo;
    private String nome;
    private Integer valor;
    private Integer estoque;

    public Frutas(String codigo, String nome, Integer valor, Integer estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

   
    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

  
}
