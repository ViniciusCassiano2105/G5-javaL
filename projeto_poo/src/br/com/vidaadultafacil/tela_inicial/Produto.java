package br.com.vidaadultafacil.tela_inicial;

import java.math.BigDecimal;

public class Produto extends CategoriaProdutos{

	// Chave primária
	private int id;
	
	public String nome = "";
	public String descricaoProd = "";
	public String autor = "";
	public BigDecimal preco;
	public int duracao;

	public String getNome() {
		return nome;
	}

	public String getDescricaoProd() {
		return descricaoProd;
	}

	public String getAutor() {
		return autor;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricaoProd(String descricao) {
		this.descricaoProd = descricaoProd;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getIdProduto() {
		return id;
	}

	public void setIdProduto(int id) {
		this.id = id;
	}

	//Método para listar todos os produtos cadastrados
	public String toString() {
        return "Produto" + "nome: " + nome + "\n" + "preco: " + preco + "\n" +"Descrição do Produto: " + descricaoProd + "" + "Autor: " + autor + "\n" + "Duração: " + duracao + "\n";
    }

}
