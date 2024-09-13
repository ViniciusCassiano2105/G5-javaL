package br.com.vidaadultafacil.tela_inicial;

import java.math.BigDecimal;

public class Produto {

    // Chave primária
    private int idProduto;

    public String nome = "";
    public String descricaoProd = "";
    public String autor = "";
    public BigDecimal preco;
    public int duracao;

    public Produto() {
    }

    public Produto(int idProduto, int fkCategoria, String nome, String descricaoProd, String autor, BigDecimal preco, int duracao) {
        this.idProduto = idProduto;
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
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome do produto não pode ser vazio.");
        }
    }

    public void setDescricaoProd(String descricaoProd) {
        if (descricaoProd != null && !descricaoProd.trim().isEmpty()) {
            this.descricaoProd = descricaoProd;
        } else {
            System.out.println("A descrição do produto não deve ser vazio");
        }
    }

    public void setAutor(String autor) {
        if ( autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("O nome do autor não deve ser vazio.");
        }
    }

    public void setPreco(BigDecimal preco) {
        if (preco.compareTo(BigDecimal.ZERO) > 0 ) {
            this.preco = preco;
        } else {
            System.out.println("O preço deve ser maior do que zero.");
        }

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


    @Override
    public String toString() {
        return "Produto [idProduto=" + idProduto + ", fkCategoria=" +  ", nome=" + nome
                + ", descricaoProd=" + descricaoProd + ", autor=" + autor + ", preco=" + preco + ", duracao=" + duracao
                + "]";
    }


}
