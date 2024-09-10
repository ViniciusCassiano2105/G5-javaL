package br.com.vidaadultafacil.pagamentos;

import java.math.BigDecimal;

public class Pagamento {

		// Chave primária
		private int id;
		
		// Método de pagamento utilizado (ex: "cartão de crédito", "boleto")
		String metodoPagamento;
		
		// Valor total do pagamento
		BigDecimal valor;
		
		// Quantidade de parcelas do pagamento
		int parcela;
		
		
		public String getMetodoPagamento() {
			return metodoPagamento;
		}
		
		public BigDecimal getValor() {
			return valor;
		}
		
		public int getParcela() {
			return parcela;
		}
		
		public void setMetodoPagamento(String metodoPagamento) {
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

		@Override
		public String toString() {
			return "Pagamento [id=" + id + ", metodoPagamento=" + metodoPagamento + ", valor=" + valor + ", parcela="
					+ parcela + "]";
		}
		
	}


