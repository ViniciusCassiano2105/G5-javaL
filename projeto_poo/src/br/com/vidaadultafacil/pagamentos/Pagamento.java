package br.com.vidaadultafacil.pagamentos;

import java.math.BigDecimal;

public class Pagamento {

		// Chave primária
		private int id;
		
		// Chave Estrangeira 
		private int fkProduto;
		private int fkCliente;
		
		// Método de pagamento utilizado (ex: "cartão de crédito", "boleto")
		TiposPagamento metodoPagamento;
		
		// Valor total do pagamento
		BigDecimal valor;
		
		// Quantidade de parcelas do pagamento
		int parcela;

		public Pagamento(int id, int fkProduto, int fkCliente, TiposPagamento metodoPagamento, BigDecimal valor, int parcela) {
			this.id = id;
			this.fkProduto = fkProduto;
			this.fkCliente = fkCliente;
			this.metodoPagamento = metodoPagamento;
			this.valor = valor;
			this.parcela = parcela;
		}		
		
		public TiposPagamento getMetodoPagamento() {
			return metodoPagamento;
		}
		
		public BigDecimal getValor() {
			return valor;
		}
		
		public int getParcela() {
			return parcela;
		}
		
		public void setMetodoPagamento(TiposPagamento metodoPagamento) {
			this.metodoPagamento = metodoPagamento;
		}
		
		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}
		
		public void setParcela(int parcela) {
			this.parcela = parcela;
		}
		
		public int getIdPagamento() {
			return id;
		}
		
		public void setIdPagamento(int id) {
			this.id = id;
		}

		public int getFkProduto() {
			return fkProduto;
		}
		
		public int getFkCliente() {
			return fkCliente;
		}
		
		@Override
		public String toString() {
			return "Pagamento [id=" + id + ", metodoPagamento=" + metodoPagamento + ", valor=" + valor + ", parcela="
					+ parcela + "]";
		}
	}