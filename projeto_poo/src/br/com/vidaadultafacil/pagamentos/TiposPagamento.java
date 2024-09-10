package br.com.vidaadultafacil.pagamentos;

public enum TiposPagamento {

    DEBITO("Debito", 1),
    CREDITO("Credito", 2),
    BOLETO("Boleto", 3),
    PIX("Pix", 4);

    private String tipo;
    private int id;

    TiposPagamento(String tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}