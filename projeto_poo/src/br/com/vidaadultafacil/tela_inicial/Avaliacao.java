package br.com.vidaadultafacil.tela_inicial;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Avaliacao {

		
		double nota;				
		String comentario;				
		Produto produto;				
		Cliente usuario;
		
		public Avaliacao() { 
		}	
		
		public Avaliacao(double nota, String comentario, Produto produto, Cliente usuario) {
			super();
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
}

