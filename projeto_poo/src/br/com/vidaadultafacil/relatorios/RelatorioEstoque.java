package br.com.vidaadultafacil.relatorios;

public class RelatorioEstoque {
		
		// Chave primária
		private int id;	
	
		// Quantidade total de produtos no estoque
		int quantidadeProdutos;
		
		public int getQuantProd() {
			return quantidadeProdutos;
		}
		
		public void setQuantProd(int quantidadeProdutos) {
			this.quantidadeProdutos = quantidadeProdutos;
		}
}