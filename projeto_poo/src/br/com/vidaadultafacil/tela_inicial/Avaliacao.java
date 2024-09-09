package br.com.vidaadultafacil.tela_inicial;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Avaliacao extends Produto {
		// Chave primária
		private int fk_Produto;
		
		double nota;				
		String comentario;				
		Produto produto;				
		Cliente usuario;
		
		public Avaliacao() { 
		}	
		
		public Avaliacao(int fk_Produto, double nota, String comentario, Produto produto, Cliente usuario) {
			this.fk_Produto = fk_Produto;
			this.nota = nota;
			this.comentario = comentario;
			this.produto = produto;
			this.usuario = usuario;
		}

		public double getNota() {
			return nota;
		}
		public String getComentario() {
			return comentario;
		}
		public Produto getProduto() {
			return produto;
		}
		public Cliente getUsuario() {
			return usuario;
		}

		public int getfk_Produto() {
			return fk_Produto;
		}

		public void setFk_Produto(int fk_Produto) {
			this.fk_Produto = fk_Produto;
		}	
		
}

