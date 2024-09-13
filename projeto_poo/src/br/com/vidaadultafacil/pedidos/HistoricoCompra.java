package br.com.vidaadultafacil.pedidos;

import java.util.HashMap;
import java.util.Map;
import br.com.vidaadultafacil.usuarios.Cliente;

public class HistoricoCompra {

	// Chave primária
	private int id;	

	// Chave Estrangeira
	private int fkProduto;
	private int fkCliente;
	private int fkPagamento;

	// Identificação do pedido
	int idPedido;

	// Usuário que realizou o pedido
	Cliente usuario;
	//Map
	private static final Map<Integer, HistoricoCompra> historicoCompras = new HashMap<>();

	public HistoricoCompra(int id, int fkProduto, int fkCliente, int fkPagamento, int idPedido) {
		this.id = id;
		this.fkProduto = fkProduto;
		this.fkCliente = fkCliente;
		this.fkPagamento = fkPagamento;
		this.idPedido = idPedido;
	}

		public HistoricoCompra(int fkProduto, int fkCliente, int fkPagamento, int idPedido) {
		this.id = historicoCompras.size() + 1;
		this.fkProduto = fkProduto;
		this.fkCliente = fkCliente;
		this.fkPagamento = fkPagamento;
		this.idPedido = idPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}

	public int getIdHistCompra() {
		return id;
	}

	public void setIdHistCompra(int id) {
		this.id = id;
	}

	public int getFkProduto() {
		return fkProduto;
	}

	public int getFkCliente() {
		return fkCliente;
	}

	public int getFkPagamento() {
		return fkPagamento;
	}

	public static Map<Integer, HistoricoCompra> getHistoricoCompras() {
		return historicoCompras;
	}

	@Override
	public String toString() {
		return "HistoricoCompra [id=" + id + ", fkProduto=" + fkProduto + ", fkcliente=" + fkCliente + ", fkpagamento="
				+ fkPagamento + ", idPedido=" + idPedido + ", usuario=" + usuario + ", listadeproduto=" +"]";
	}
}