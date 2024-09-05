package br.com.vidaadultafacil.pedidos;

import br.com.vidaadultafacil.tela_inicial.Produto;
import br.com.vidaadultafacil.usuarios.Cliente;

public class HistoricoCompra {
		
		// Identificação do pedido
		String idPedido;
		
		// Usuário que realizou o pedido
		Cliente usuario;
		
		// Lista de produtos comprados
		Produto listadeproduto;
		
		// Status atual do pedido (ex: "em processamento", "entregue")
		String status;

		public String getIdPedido() {
			return idPedido;
		}

		public void setIdPedido(String idPedido) {
			this.idPedido = idPedido;
		}

		public Cliente getUsuario() {
			return usuario;
		}

		public void setUsuario(Cliente usuario) {
			this.usuario = usuario;
		}

		public Produto getListadeproduto() {
			return listadeproduto;
		}

		public void setListadeproduto(Produto listadeproduto) {
			this.listadeproduto = listadeproduto;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	
}

