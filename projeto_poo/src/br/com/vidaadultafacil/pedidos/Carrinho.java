package br.com.vidaadultafacil.pedidos;
import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.tela_inicial.Produto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Carrinho {

	private static Logger logger = Logger.getLogger(Util.class.getName());
    // Chave primária
    private int id;

    // Chave Estrangeira 
    private int FkCliente;

    // Lista de produtos no carrinho
    private List<Produto> produtos;
    private static final Map<Integer, Carrinho> mapaCarrinho = new HashMap();
    
    public static Map<Integer, Carrinho> getMapCarrinho() {
    	return mapaCarrinho;
    }

	public Carrinho(int id, int fkCliente) {
        this.id = id;
        this.FkCliente = fkCliente;
        this.produtos = new ArrayList<>();
    }

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

    // Método para adicionar um produto ao carrinho
    /*public static void adicionarProduto(int produto) {
        if (produto != null) {
            produtos.add(produto);
            logger.info("Produto adicionado: " + produto.getNome());
        } else {
        	logger.info("Erro: Produto inválido.");
        }
    }*/

    // Método para remover um produto do carrinho
    public void removerProduto(Produto produto) {
        if (produtos.contains(produto)) {
            produtos.remove(produto);
            logger.info("Produto removido: " + produto.getNome());
        } else {
        	logger.info("Erro: Produto não está no carrinho.");
        }
    }

    // Método para verificar se o carrinho está vazio
    public boolean isCarrinhoVazio() {
        if (produtos.isEmpty()) {
        	logger.info("O carrinho está vazio.");
            return true;
        } else {
        	logger.info("O carrinho tem produtos.");
            return false;
        }
    }

    @Override
    public String toString() {
        if (produtos.isEmpty()) {
            return "Carrinho [id=" + id + ", fkcliente=" + FkCliente + ", produtos=O carrinho está vazio]";
        } else {
            return "Carrinho [id=" + id + ", fkcliente=" + FkCliente + ", produtos=" + produtos + "]";
		}
	}
}