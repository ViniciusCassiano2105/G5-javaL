package br.com.vidaadultafacil.pagamentos;

import java.math.BigDecimal;

public class Pagamento {

		
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
	}

