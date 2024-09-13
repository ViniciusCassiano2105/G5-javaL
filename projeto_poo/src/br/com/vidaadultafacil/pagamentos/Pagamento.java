package br.com.vidaadultafacil.pagamentos;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Pagamento {

    // Chave primária
    private int id;
    
    // Chaves estrangeiras
    private int fkProduto;
    private int fkCliente;
    
    // Método de pagamento utilizado (ex: "cartão de crédito", "boleto")
    private TiposPagamento metodoPagamento;
    
    // Valor total do pagamento
    private BigDecimal valor;
    
    // Quantidade de parcelas do pagamento
    private int parcelas;

    //Map
    private static final Map<Integer, Pagamento> pagamentos = new HashMap<>();

    // Construtor
    public Pagamento(int id, int fkProduto, int fkCliente, TiposPagamento metodoPagamento, BigDecimal valor, int parcelas) {
        this.id = id;
        this.fkProduto = fkProduto;
        this.fkCliente = fkCliente;
        this.metodoPagamento = metodoPagamento;
       
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }
        this.valor = valor;

        if (parcelas <= 0) {
            throw new IllegalArgumentException("A quantidade de parcelas deve ser maior que zero.");
        }
        this.parcelas = parcelas;
    }

    public Pagamento(int fkProduto, int fkCliente, TiposPagamento metodoPagamento, BigDecimal valor, int parcelas) {
        this.id = pagamentos.size() + 1;
        this.fkProduto = fkProduto;
        this.fkCliente = fkCliente;
        this.metodoPagamento = metodoPagamento;
       
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }
        this.valor = valor;

        if (parcelas <= 0) {
            throw new IllegalArgumentException("A quantidade de parcelas deve ser maior que zero.");
        }
        this.parcelas = parcelas;
    }


    // Get e Set
    public TiposPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(TiposPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        if (parcelas <= 0) {
            throw new IllegalArgumentException("A quantidade de parcelas deve ser maior que zero.");
        }
        this.parcelas = parcelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFkProduto() {
        return fkProduto;
    }

    public void setFkProduto(int fkProduto) {
        this.fkProduto = fkProduto;
    }

    public int getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(int fkCliente) {
        this.fkCliente = fkCliente;
    }

    public static Map<Integer, Pagamento> getPagamentos() {
        return pagamentos;
    }

    // Sobrescrita
    @Override
    public String toString() {
        return "Pagamento [id=" + id + ", fkProduto=" + fkProduto + ", fkCliente=" + fkCliente 
                + ", metodoPagamento=" + metodoPagamento + ", valor=" + valor 
                + ", parcelas=" + parcelas + "]";
    }
}
