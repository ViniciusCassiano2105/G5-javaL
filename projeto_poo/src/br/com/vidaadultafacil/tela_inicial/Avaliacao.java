package br.com.vidaadultafacil.tela_inicial;

import br.com.vidaadultafacil.usuarios.Cliente;

public class Avaliacao{
		// Chave primária
		private int fkProduto;
		private int id;
		
		double nota;				
		String comentario;								
		Cliente usuario;
		
		public Avaliacao() { 
		}	
		
		public Avaliacao(int fkProduto, double nota, String comentario, Cliente usuario) {
			this.fkProduto = fkProduto;
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

		public int getFkProduto() {
			return fkProduto;
		}

		public void setFkProduto(int fkProduto) {
			this.fkProduto = fkProduto;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Avaliacao [fkProduto=" + fkProduto + ", id=" + id + ", nota=" + nota + ", comentario=" + comentario
					+ ", usuario=" + usuario + "]";
		}	
		
}

