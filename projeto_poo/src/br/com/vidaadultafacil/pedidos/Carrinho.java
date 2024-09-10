package br.com.vidaadultafacil.pedidos;
import br.com.vidaadultafacil.tela_inicial.Produto;
import java.util.List;

public class Carrinho {

	// Chave primária
	private int id;
	
	// Chave Estrangeira 
	private int FkCliente;

	public Carrinho(int id, int fkProduto, int fkCliente) {
		this.id = id;
		this.FkCliente = fkCliente;
	}
			
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

	public int getFkCliente() {
		return FkCliente;
	}

	@Override
	public String toString() {
		return "Carrinho [id=" + id + ", fkcliente=" + FkCliente + ", produtos=" + produtos + "]";
	}
}