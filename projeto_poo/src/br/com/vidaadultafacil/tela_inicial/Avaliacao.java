package br.com.vidaadultafacil.tela_inicial;
import java.util.HashMap;
import java.util.Map;

public class Avaliacao {
    // Chave primária
    private int fkProduto;
    private int id;

    private double nota;
    private String comentario;
    private Cliente usuario;
    private static final Map<Integer, Avaliacao> avaliacoes = new HashMap();

    public Avaliacao() { 
    }

    public Avaliacao(int id ,int fkProduto, double nota, String comentario, Cliente usuario) {
        this.id = id;
    	this.fkProduto = fkProduto;
        setNota(nota); 
        setComentario(comentario); 
        this.usuario = usuario;
    }
    
    public Avaliacao(int fkProduto, double nota, String comentario, Cliente usuario) {
        this.id = avaliacoes.size() +1;
        this.fkProduto = fkProduto;
        setNota(nota); 
        setComentario(comentario); 
        this.usuario = usuario;
    }

    public double getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public int getFkProduto() {
        return fkProduto;
    }

    public void setFkProduto(int fkProduto) {
        this.fkProduto = fkProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static Map <Integer, Avaliacao> getMapAvaliacao() {
    	return avaliacoes;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota deve estar entre 0 e 10.");
        }
    }

    public void setComentario(String comentario) {
        if (comentario != null && !comentario.trim().isEmpty()) {
            this.comentario = comentario;
        } else {
            System.out.println("Comentário não pode ser vazio ou nulo.");
        }
    }

    @Override
    public String toString() {
        return "Avaliacao [fkProduto=" + fkProduto + ", id=" + id + ", nota=" + nota + ", comentario=" + comentario
                + ", usuario=" + usuario + "]";
    }
}
