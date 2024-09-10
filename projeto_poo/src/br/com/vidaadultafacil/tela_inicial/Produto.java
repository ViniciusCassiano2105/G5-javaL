package br.com.vidaadultafacil.tela_inicial;

import java.math.BigDecimal;

public class Produto {

	// Chave primária
	private int idProduto;
	private int fkCategoria;

	public String nome = "";
	public String descricaoProd = "";
	public String autor = "";
	public BigDecimal preco;
	public int duracao;

	public Produto() {
	}

	public Produto(int idProduto, int fkCategoria, String nome, String descricaoProd, String autor, BigDecimal preco,
			int duracao) {
		this.idProduto = idProduto;
		this.fkCategoria = fkCategoria;
		this.nome = nome;
		this.descricaoProd = descricaoProd;
		this.autor = autor;
		this.preco = preco;
		this.duracao = duracao;
	}

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

	public void setDescricaoProd(String descricaoProd) {
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
		return idProduto;
	}

	public void setId(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getFkCategoria() {
		return fkCategoria;
	}

	public void setFkCategoria(int fkCategoria) {
		this.fkCategoria = fkCategoria;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", fkCategoria=" + fkCategoria + ", nome=" + nome
				+ ", descricaoProd=" + descricaoProd + ", autor=" + autor + ", preco=" + preco + ", duracao=" + duracao
				+ "]";
	}
	

}
