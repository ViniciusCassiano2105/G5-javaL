package br.com.vidaadultafacil.tela_inicial;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Avaliacao extends Produto {
		// Chave primária
		private int fk_Produto;
		
		double nota;				
		String comentario;								
		Cliente usuario;
		
		public Avaliacao() { 
		}	
		
		public Avaliacao(int fk_Produto, double nota, String comentario, Cliente usuario) {
			this.fk_Produto = fk_Produto;
			this.nota = nota;
			this.comentario = comentario;
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

		public int getfk_Produto() {
			return fk_Produto;
		}

		public void setFk_Produto(int fk_Produto) {
			this.fk_Produto = fk_Produto;
		}	
		
}

