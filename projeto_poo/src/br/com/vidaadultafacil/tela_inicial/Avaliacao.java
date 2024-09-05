package br.com.vidaadultafacil.tela_inicial;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Avaliacao {

		// Nota atribuída ao produto (ex: de 1.0 a 5.0)
		double nota;
		
		// Comentário sobre o produto
		String comentario;
		
		// Produto avaliado
		Produto produto;
		
		// Usuário que fez a avaliação
		Cliente usuario;

		public double getNota() {
			return nota;
		}

		public void setNota(double nota) {
			this.nota = nota;
		}

		public String getComentario() {
			return comentario;
		}

		public void setComentario(String comentario) {
			this.comentario = comentario;
		}

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}

		public Cliente getUsuario() {
			return usuario;
		}

		public void setUsuario(Cliente usuario) {
			this.usuario = usuario;
		}
		
}

