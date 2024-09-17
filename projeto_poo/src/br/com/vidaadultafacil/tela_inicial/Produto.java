package br.com.vidaadultafacil.tela_inicial;

import java.util.HashMap;
import java.util.Map;

public class Produto {

    // Chave primária
    private int id;

    public String nome = "";
    public String descricaoProd = "";
    public String autor = "";
    public double preco;
    public int duracao;
    private static final Map<Integer, Produto> produtos = new HashMap();
    
    public Produto() {
    }

    public Produto(int id, int fkCategoria, String nome, String descricaoProd, String autor, double preco, int duracao) {
        this.id = id;
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

    public double getPreco() {
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

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Map<Integer, Produto> getMapProdutos() {
        return produtos;
    }
    
    @Override
    public String toString() {
        return "Produto [idProduto=" + id + ", fkCategoria=" +  ", nome=" + nome
                + ", descricaoProd=" + descricaoProd + ", autor=" + autor + ", preco=" + preco + ", duracao=" + duracao
                + "]";
    }


}
