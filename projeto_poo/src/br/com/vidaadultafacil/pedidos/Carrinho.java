package br.com.vidaadultafacil.pedidos;
import br.com.vidaadultafacil.tela_inicial.Produto;
import java.util.List;

public class Carrinho {

	// Chave primária
	private int id;
			
	private List<Produto> produtos;
		
	public List<Produto> getProdutos() {
        return produtos;
	}
}