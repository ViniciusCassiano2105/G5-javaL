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

		public int getIdRelEstoque() {
			return id;
		}

		public void setIdRelEstoque(int id) {
			this.id = id;
		}
		
		
}