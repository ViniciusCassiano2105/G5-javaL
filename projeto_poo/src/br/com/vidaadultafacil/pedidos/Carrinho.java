package br.com.vidaadultafacil.pedidos;
import br.com.vidaadultafacil.tela_inicial.Produto;
import java.util.List;

public class Carrinho {

	// Chave primária
	private int id;
	
	// Chave Estrangeira 
			private int fkProduto;
			private int fkcliente;
			
	private List<Produto> produtos;
		
	public List<Produto> getProdutos() {
        return produtos;
	}

	public int getIdCarrinho() {
		return id;
	}

	public void setIdCarrinho(int id) {
		this.id = id;
	}

	public int getFkProduto() {
		return fkProduto;
	}

	public int getFkcliente() {
		return fkcliente;
	}

	@Override
	public String toString() {
		return "Carrinho [id=" + id + ", fkProduto=" + fkProduto + ", fkcliente=" + fkcliente + ", produtos=" + produtos
				+ "]";
	}
}